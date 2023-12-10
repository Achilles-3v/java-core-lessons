package chapter4.oop.employee;

import java.util.Random;

public class Employee {

    private static int nextId = 1;

    private String name = "";
    private double salary;
    private int id;

    static {
        var generator = new Random();
        nextId = generator.nextInt(1000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        this("Employee #" + nextId, s);
    }

    public Employee() {}

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static void main(String[] args) {

        var e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
