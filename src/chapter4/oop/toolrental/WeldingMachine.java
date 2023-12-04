package chapter4.oop.toolrental;

public class WeldingMachine extends Tool {

    public WeldingMachine(Price price, Brand brand) {
        super(price, brand);
    }

    @Override
    public void prepareTheTool() {
        System.out.print("Status: ");
        this.statusTool(true);
    }
}
