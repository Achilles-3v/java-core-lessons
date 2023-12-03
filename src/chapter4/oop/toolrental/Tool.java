package chapter4.oop.toolrental;

public class Tool {
    private Price price;
    private Brand brand;

    public Tool(Price price, Brand brand) {
        this.price = price;
        this.brand = brand;
    }

    public Price getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void statusTool(boolean status) {
        if (status)
            System.out.println("Available");
        else
            System.out.println("Not available");
    }
}
