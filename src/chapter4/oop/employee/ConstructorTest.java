package chapter4.oop.employee;

public class ConstructorTest {

    public static void main(String[] args) {

        var staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e: staff) {
            System.out.println("\nname = " + e.getName() +
                    "\nid = " + e.getId() +
                    "\nsalary = " + e.getSalary());
        }
    }
}
