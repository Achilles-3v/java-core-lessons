package chapter1.composition.computer;

public class Computer {
    private Ram ram;
    private Ssd ssd;
    private static int counter;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void printState() {
        System.out.println("Computer:\nram: " + ram.getValue() + "\nssd: " + ssd.getValue());
    }
}
