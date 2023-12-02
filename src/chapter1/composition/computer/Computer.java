package chapter1.composition.computer;

public class Computer {
    private Ram ram;
    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState() {
        System.out.println("Computer:\nram: " + ram.getValue() + "\nssd: " + ssd.getValue());
    }
}
