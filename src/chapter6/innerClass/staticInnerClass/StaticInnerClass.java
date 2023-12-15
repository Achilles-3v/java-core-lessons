package chapter6.innerClass.staticInnerClass;

/**
 * В этой программе демонстрируется применение
 * статического внутреннего класса
 * @version 1.02 2023-12-16
 * @author Cay Horstmann
 */
public class StaticInnerClass {

    public static void main(String[] args) {

        double[] d = new double[20];
        for (int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.printf("\nmin = %.2f", p.getFirst());
        System.out.printf("\nmax = %.2f", p.getSecond());
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

    /**
     * Определяет минимальное и максимальное
     * числа в массиве
     * @param values Массив чисел с плавающей точкой
     * @return Пара, первым элементом которой является
     * минимальное число, а вторым элементом максимальное.
     */
    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}