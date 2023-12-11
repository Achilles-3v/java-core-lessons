package chapter5.oop.employee;

public class Manager extends Employee {

    private double bonus;

    /**
     * @param n Имя работника
     * @param s Зарплата
     * @param year Год приема на работу
     * @param month Месяц приема на работу
     * @param day День приема на работу
     */
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", this.getSalary());
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
