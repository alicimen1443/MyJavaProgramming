package week04;

public class OnSaleItem extends Item {

    private double discount;

    public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) { // we are getting these from user at the time of object being created
        super(name, quantity, catalogNumber, (price-price*discount)); // and pass them to the super class constructor
        setDiscount(discount);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if(discount<0){
            System.err.println("Discount cannot be less than zero");
            return;
        }
        this.discount = discount;
    }


    @Override
    public String toString() {
        return "OnSaleItem{" +
                "discount ='" + discount+"%" + '\'' +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
