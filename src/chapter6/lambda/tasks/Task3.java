package chapter6.lambda.tasks;

import java.util.Map;

/**
 * Дана Map<String, Integer>. Найти сумму всех
 * значений, длина ключей которых меньше 7 символов
 * @version 1.3 2023-12-15
 */
public class Task3 {

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of(
                "str-111", 1,
                "str-222", 2,
                "str-333", 3,
                "str-11", 4,
                "str-22", 5,
                "str-33", 6
        );

        int result = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(result);
    }
}
