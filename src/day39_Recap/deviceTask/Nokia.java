package day39_Recap.deviceTask;

public class Nokia extends Phone{

    public Nokia(String model, double price, boolean hasBattery) {
        super("Nokia", model, price, hasBattery);
    }

    public void selfDefense(){
        System.out.println("you can use "+getBrand()+" "+getModel()+" as self defense tool");
    }
}
