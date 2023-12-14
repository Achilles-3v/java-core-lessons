package chapter6.lambda.tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список строк. Найти количество
 * уникальных строк, длиной более 8 символов
 * @version 1.2 2023-12-15
 */
public class Task2 {

    public static void main(String[] args) {

        List<String> strings = List.of(
                "string-1",
                "string-1",
                "string-2",
                "string-3",
                "string-5",
                "string-10",
                "string-10",
                "string-10",
                "string-13",
                "string-13",
                "string-17"
        );

        int result = strings.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result);

        long result2 = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();
        System.out.println(result2);
    }
}
