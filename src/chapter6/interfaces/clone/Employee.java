package chapter6.interfaces.clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    /**
     * Устанавливает заданную дату приема на работу
     * @param year Год приема на работу
     * @param month Месяц приема на работу
     * @param day День приема на работу
     */
    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public String toString() {
        return "Employee[name=" + name + ", salary=" + salary +
                ", hireDay=" + hireDay + "]";
    }
}