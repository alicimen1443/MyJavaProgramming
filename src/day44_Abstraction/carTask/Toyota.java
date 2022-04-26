package day44_Abstraction.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Press the \"start\" button");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" is driving smoothly");



    }
}
