package week04;

public class Item {

    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    public Item(String name,int quantity,int catalogNumber,double price){
        setName(name);
        this.quantity=quantity;
        this.catalogNumber=catalogNumber;
        setPrice(price);
    }

    public void setName(String name){
        if(name==null||name.isEmpty()){
            return;
        }
         this.name=name;
    }

    public void setPrice(double price){
        if(price<0){
            System.err.println("price cannot be negative");
            return;
        }
            this.price=price;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public int getCatalogNumber(){
        return catalogNumber;
    }

    public int getQuantity(){
        return quantity;
    }

    public String toString() {
        return "Regular Item{" +
                "name='" + name + '\'' +
                ", catalogNumber=" + catalogNumber +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
