package chapter6.lambda.mapReduce;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * В этой программе демонстрируется
 * использование Optional и ссылки на метод
 * @version 1.0 2023-12-14
 */
public class OptionalTest {

    public static void main(String[] args) {

        Optional<Student> maybeStudent = Stream.of(
                new Student(10, "Oleg"),
                new Student(102, "Igor"),
                new Student(33, "Mary"),
                new Student(54, "Carl"),
                new Student(78, "Hack"),
                new Student(72, "Vera"),
                new Student(32, "Rose"),
                new Student(41, "Stanislav"),
                new Student(14, "Bob"),
                new Student(74, "Sam")
        )
                .sequential()
                .reduce((student, student2) -> student.getAge() > student2.getAge() ? student : student2);

        maybeStudent.map(Student::getAge)
                .flatMap(age -> Optional.of(age * 2))
                .ifPresent(System.out::println);
    }
}
