package chapter6.interfaces;
import java.util.*;

/**
 * В этой программе демонстрируется
 * применение интерфейса Comparable
 * @version 1.30 2023-12-13
 * @author Cay Horstmann
 */
public class EmployeeSortTest {

    public static void main(String[] args) {

        var staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("\nname: " + e.getName() +
                    "\nsalary: " + e.getSalary());
        }
    }
}
