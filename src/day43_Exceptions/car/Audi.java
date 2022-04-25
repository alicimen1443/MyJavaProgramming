package day43_Exceptions.car;

public final class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override// Any method that you have in the concrete class must have the body

    public void start() {
        System.out.println("Push the start button");
    }

    public void autoPark(){

        System.out.println(getBrand()+" "+getModel()+" has auto park feature");

    }




}
