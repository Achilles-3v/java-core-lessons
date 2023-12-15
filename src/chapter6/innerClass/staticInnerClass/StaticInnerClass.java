package chapter6.innerClass.staticInnerClass;

/**
 * В этой программе демонстрируется применение
 * статического внутреннего класса
 * @version 1.02 2023-12-16
 * @author Cay Horstmann
 */
public class StaticInnerClass {

    public static void main(String[] args) {


    }
}

class ArrayAlg {
    /**
     * Пара чисел с плавающей точкой
     */
    public static class Pair {
        private double first;
        private double second;

        public Pair(double f, double s) {
            first = f;
            second = s;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }
}