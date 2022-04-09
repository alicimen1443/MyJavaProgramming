package day33_Statics;

public class Iphone2 {

    public String model;
    public int price;
    public String color;
    public String size;
    public static String brand = "Apple";
    public static String OS = "IOS";
    public static String madeIn = "China";

    public Iphone2(String model, int price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println("having facetime with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("having facetime with = " + email);
    }

    public void call(long phoneNumber){
        System.out.println("calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("sending message to "+phoneNumber);
    }

    public String toString() {
        return "Iphone2{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
