package chapter5.oop.equalstest;

import java.util.ArrayList;

/**
 * В этой программе демонстрируется
 * применение класса ArrayList
 * @version 1.11 2023-12-12
 * @author Cay Horstmann
 */
public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("\nname: " + e.getName() +
                    "\nsalary: " + e.getSalary() +
                    "\nhireDay: " + e.getHireDay());
        }
    }
}
