package day44_Abstraction.deviceTask;

public class Device {

    private final String brand,model;
    private double price;
    private String color;
    private final String size;

    public Device(String brand, String model, String size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public final static boolean hasBattery,hasPowerButton;

    static {
        hasBattery=true;
        hasPowerButton=true;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException("Invalid price");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            throw new RuntimeException("Invalid color");
        }else if(color==null){
            throw new Error("Color cannot be null");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }
}
