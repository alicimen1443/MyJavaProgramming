package day43_Exceptions.deviceTask;

public abstract class Device {

    private final String brand,model;
    private double price;

    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
       setPrice(price);
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
        this.price = price;
    }

    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
