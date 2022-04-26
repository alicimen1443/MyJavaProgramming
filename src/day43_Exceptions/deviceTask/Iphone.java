package day43_Exceptions.deviceTask;

public class Iphone extends Phone{

    public Iphone(String model, double price) {
        super("Iphone", model, price);
    }

    @Override
    public void call(long num) {
        System.out.println(getBrand()+" "+getModel()+" is calling "+num);

    }

    @Override
    public void turnOff() {
        System.out.println("Press the turn off button");
    }


}
