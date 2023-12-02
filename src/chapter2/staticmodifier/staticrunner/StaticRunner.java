package chapter2.staticmodifier.staticrunner;

import chapter1.composition.computer.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        System.out.println(Computer.getCounter());
    }
}
