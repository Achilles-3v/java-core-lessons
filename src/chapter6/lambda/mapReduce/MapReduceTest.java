package chapter6.lambda.mapReduce;

import java.util.stream.Stream;

public class MapReduceTest {

    public static void main(String[] args) {

        Stream.of(
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
                .map(Student::getAge)
                .reduce(Math::max)
                .ifPresent(System.out::println);

    }
}
