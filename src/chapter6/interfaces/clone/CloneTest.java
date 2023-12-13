package chapter6.interfaces.clone;

/**
 * В этой программе демонстрируется клонирование объектов
 * @version 1.11 2023-12-13
 * @author Cay Horstmann
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        var original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original: " + original);
        System.out.println("copy: " + copy);
    }
}
