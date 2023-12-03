package chapter4.oop.toolrental;

public class Drill extends Tool {
    private int battery;

    public Drill(Price price, Brand brand, int battery) {
        super(price, brand);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public void prepareTheTool() {
        System.out.println("Battery: " + battery + " mAch is ready");
        this.statusTool(true);
    }
}
