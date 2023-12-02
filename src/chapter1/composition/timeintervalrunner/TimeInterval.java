package chapter1.composition.timeintervalrunner;

public class TimeInterval {
    private static final int SEK_IN_MIN = 60;
    private static final int SEK_IN_HOUR = 3600;
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / SEK_IN_HOUR;
        this.minutes = totalSeconds % SEK_IN_HOUR / SEK_IN_MIN;
        this.seconds = totalSeconds % SEK_IN_HOUR % SEK_IN_MIN;
    }

    public TimeInterval(int second, int minutes, int hours) {
        this.seconds = second;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * SEK_IN_MIN + hours * SEK_IN_HOUR;
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }

    public void printTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
