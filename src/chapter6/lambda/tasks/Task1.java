package chapter6.lambda.tasks;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Дан список целых чисел. Найти среднее
 * всех нечетных чисел, делящихся на 5
 * @version 1.0 2023-12-15
 */
public class Task1 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 4, 5, 10, 12, 15, 20, 25, 30);
        OptionalDouble optionalDouble = integers.stream()
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();

        optionalDouble.ifPresent(System.out::println);
    }
}
