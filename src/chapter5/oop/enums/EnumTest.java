package chapter5.oop.enums;
import java.util.*;

/**
 * В этой прогарамме демонстрируются перечислимые типы
 * @version 1.0 2023-12-12
 * @author Cay Horstmann
 */
public class EnumTest {

    public static void main(String[] args) {

        var in = new Scanner(System.in);
        System.out.print("Enter a size: " + "(SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.nextLine().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you " + "paid attention to the _.");
    }
}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    private String abbreviation;
}