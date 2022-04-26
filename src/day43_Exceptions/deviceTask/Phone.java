package day43_Exceptions.deviceTask;

public abstract class Phone extends Device {

    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public abstract void call(long num);


}
