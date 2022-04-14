package day39_Recap.deviceTask;

public class Device {

    private String brand,model;
    private double price;
    private static boolean hasPowerButton=true;
    private boolean hasBattery;

    public Device(String brand, String model, double price, boolean hasBattery) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasBattery = hasBattery;
    }

    public static boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand==null||brand.isEmpty()||brand.isBlank()){
            System.err.println("Invalid brand data");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null||model.isEmpty()||model.isBlank()){
            System.err.println("Invalid model data");
            System.exit(1);
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Price cannot be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    public void turnOn(){
        System.out.println(brand+" "+model+" is turning on");
    }

    public void turnOf(){
        System.out.println(brand+" "+model+" is turning off");
    }


    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", has battery=" + hasBattery +
                ", has power button =" + hasPowerButton +
                '}';
    }
}
