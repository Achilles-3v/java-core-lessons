package chapter1.composition.timeintervalrunner;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.printTime();

        TimeInterval sumTimeInterval = timeInterval.sum(timeInterval2);
        sumTimeInterval.printTime();
    }
}
