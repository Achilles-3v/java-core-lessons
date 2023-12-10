package chapter4.oop.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000);
        staff[1] = new Employee("Harry Hacker", 50000);
        staff[2] = new Employee("Tony Tester", 40000);

        for (Employee e: staff) {
            e.raiseSalary(5);
        }

        for (Employee e: staff) {
            System.out.println("name: " + e.getName() +
                    "\nid: " + e.getId() +
                    "\nsalary: " + e.getSalary() + "\n");
        }

        int n = Employee.getNextId();
        System.out.println("Next available id = " + n);
    }
}
