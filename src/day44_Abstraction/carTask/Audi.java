package day44_Abstraction.carTask;

public class Audi extends Car implements AutoPark{

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" is driving very well");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" has auto park feature");
    }
}
