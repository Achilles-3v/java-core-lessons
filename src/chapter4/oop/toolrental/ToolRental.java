package chapter4.oop.toolrental;

public class ToolRental {
    public static void main(String[] args) {
        Price price = new Price(5000);
        Brand brand = new Brand("Bosch");

        Tool tool = new Tool(price, brand);
        tool.statusTool(true);
    }
}
