package chapter5.oop.objectanalyzer;
import java.util.*;

/**
 * В этой программе рефлексия применяется
 * для слежения за объектами
 * @version 1.13 2023-12-12
 * @author Cay Hortsmann
 */
public class ObjectAnalyzerTest {

    public static void main(String[] args)
            throws ReflectiveOperationException {

        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
