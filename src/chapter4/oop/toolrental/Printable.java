package chapter4.oop.toolrental;

import java.util.Random;

public interface Printable {
    String NAME = "Name";
    Random RANDOM = new Random();

    default void printWithRandom() {
        System.out.println(generateRandom());
        print();
    }

    void print();

    private int generateRandom() {
        return RANDOM.nextInt();
    }
}
