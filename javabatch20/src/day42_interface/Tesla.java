package day42_interface;

public class Tesla extends ElectricCar{

    public Tesla(String model, double price, String color) {
        super(model, price, color);
    }

    @Override
    public void start() {
        System.out.println("tesla is starting");
        System.out.println("change to drive mode.");

    }

    @Override
    public void charge() {
        System.out.println("Tesla charging - plugin to electric outlet...");

    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving");

    }

}
