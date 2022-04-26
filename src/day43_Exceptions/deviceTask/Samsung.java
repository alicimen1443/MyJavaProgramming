package day43_Exceptions.deviceTask;

public class Samsung extends Phone{

    public Samsung(String model, double price) {
        super("Samsung", model, price);
    }

    @Override
    public void call(long num) {

        System.out.println(getBrand()+" "+getModel()+" is calling "+num);

    }

    @Override
    public void turnOff() {
        System.out.println("Say turn off");
    }
}
