package day33_Statics;

public class Car {

    public String make,model,color;
    public int year,price;

    public static int numberOfWheels = 4;
    public static boolean hasBattery = true;
    public static boolean hasSeats = true;

    public Car(String make, String model, String color, int year, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void drive(String name){
        System.out.println(name+" is driving "+make+" "+model);
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price =$" + price +
                '}';
    }
}
