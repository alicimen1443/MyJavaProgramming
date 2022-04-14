package day39_Recap.deviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean hasBattery) {
        super(brand, model, price, hasBattery);
    }

    public void channelUp(){
        System.out.println("the channel is going up");
    }

    public void channelDown(){
        System.out.println("the channel is going down");
    }
}
