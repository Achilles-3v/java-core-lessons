package chapter6.interfaces.sort;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Сравнивает работников по зарплате
     * @param other the object to be compared.
     * @return Отрицательное значение, если зарплата
     * данного работника меньше, чем у другого работника;
     * Нулевое значение, если их зарплаты одинаковы;
     * а иначе - положительное значение.
     */
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
