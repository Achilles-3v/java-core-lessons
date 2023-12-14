package chapter6.lambda.tasks;

import java.util.Comparator;
import java.util.List;

/**
 * Дан класс Person с полями firstName, lastName и
 * age. Вывести имя самого старшего человека, у
 * которого длина этого имени не привышает 15 символов
 * @version 1.5 2023-12-15
 */
public class Task5 {

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 34),
                new Person("Oleg", "Svetlov", 41),
                new Person("Dan", "Moris", 15),
                new Person("Rich", "Many", 24),
                new Person("Evgenii", "Ivanov", 19),
                new Person("Roman", "Volgin", 22)
        );

        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);
    }
}
