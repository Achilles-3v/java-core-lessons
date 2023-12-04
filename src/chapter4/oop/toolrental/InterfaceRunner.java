package chapter4.oop.toolrental;

public class InterfaceRunner {
    public static void main(String[] args) {
        Printable drill = new Drill(new Price(11000), new Brand("DeWalt"), 5000);
        Printable weldingMachine = new WeldingMachine(new Price(15300), new Brand("Interskol"));

        print(drill, weldingMachine);
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
        }
    }
}
