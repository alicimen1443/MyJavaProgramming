package day39_Recap.deviceTask;

public class Iphone extends Phone{

    public Iphone( String model, double price, boolean hasBattery) {
        super("Apple", model, price, hasBattery);
    }

   public void faceTime(long number){
        System.out.println(getBrand()+" "+getModel()+" is having a facetime with: "+number);
    }

    public void faceTime(String email){
        System.out.println(getBrand()+" "+getModel()+" is having a facetime with:  "+email);
    }
}
