package day44_Abstraction.carTask;

public class Nio extends Car implements AutoPilot,AutoPark{

    public Nio( String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" has auto park feature");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" has self drive feature");
    }

    @Override
    public void start() {
        System.out.println("Say \"start\"");
    }

    @Override
    public void drive() {
        System.out.println("You can watch tv while driving "+getMake()+" "+getModel());
    }
}
