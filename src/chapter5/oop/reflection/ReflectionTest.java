package chapter5.oop.reflection;
import java.util.*;
import java.lang.reflect.*;

/**
 * В этой программе рефлексия применияется для
 * вывода всех компонентов класса
 * @version 1.11 2023-12-12
 * @author Cay Hortsmann
 */
public class ReflectionTest {

    public static void main(String[] args) throws ReflectiveOperationException {

        String name;
        if (args.length > 0) name = args[0];
        else {
            var in = new Scanner(System.in);
            System.out.println("Enter class name " + "(e.g. java.util.Date): ");
            name = in.next();
        }

        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();
        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0)
            System.out.print(modifiers + " ");
        System.out.print("class " + name);
        if (supercl != null && supercl != Object.class)
            System.out.print(" extends " + supercl.getName());
        System.out.print("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");
    }

    /**
     * Выводит все конструкторы класса
     * @param cl Класс
     */
    public static void printConstructors(Class cl) {

        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print(name + "(");
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Выводит все методы класса
     * @param cl Класс
     */
    public static void printMethods(Class cl) {

        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.print(retType.getName() + " " + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * Выводит все поля класса
     * @param cl Класс
     */
    public static void printFields(Class cl) {

        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0)
                System.out.print(modifiers + " ");
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
