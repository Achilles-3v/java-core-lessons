package chapter5.oop.methods;
import java.lang.reflect.*;

/**
 * В этой программе демонстрируется применение
 * рефлексии для вызова методов
 * @version 1.2 2023-12-13
 * @author Cay Hortsmann
 */
public class MethodTableTest {

    public static void main(String[] args) throws NoSuchMethodException {

        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     * Возвращает квадрат числа
     * @param x Число
     * @return Квадрат числа
     */
    public static double square(double x) {
        return x * x;
    }

    /**
     * Выводит в табличном виде значения
     * x и y указанного метода
     * @param from Нижняя граница значения х
     * @param to Верхняя граница значения y
     * @param n Количество строк в таблице
     * @param f Метод, полнчающий и возвращающий
     *          значение типа double
     */
    public static void printTable(double from, double to, int n, Method f) {
        System.out.println(f);
        double dx = (to - from) / (n - 1);
        for (double x = from; x <= to; x += dx) {
            try {
                double y = (Double) f.invoke(null, x);
                System.out.printf("%10.4f | %10.4f%n", x, y);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
