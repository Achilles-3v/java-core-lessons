package chapter6.lambda.tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список целых чисел, вывести строку
 * представляющую собой конкатенацию строковых
 * представлений этих чисел.
 * @version 1.4 2023-12-15
 */
public class Task4 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        String result = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
