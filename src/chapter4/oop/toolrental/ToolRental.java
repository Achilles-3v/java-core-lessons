package chapter4.oop.toolrental;

public class ToolRental {
    public static void main(String[] args) {
        Tool drill = new Drill(new Price(11000), new Brand("DeWalt"), 5000);
        Tool weldingMachine = new WeldingMachine(new Price(15300), new Brand("Interskol"));

        prepareTheTool(drill, weldingMachine);
    }

    public static void prepareTheTool(Tool... tools) {
        for (Tool tool : tools) {
            tool.prepare();
        }
    }
}
