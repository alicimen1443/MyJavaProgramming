package day32_Constructors;

public class Carpet { // This carpet class, we don't use this for running the objects we just create it for creating the objects
    public double width, length, unitPrice; // by public access modifier, I can reach this instance variables from everywhere in this project.(inside this package,outside this package)
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;
    }

    //Should I create cost method as instance method or static method?Each of the carpet objects, price could be different. If price could be different, that means this method needs to be instance.
    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;
        if(isPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }
}
/*
1.Carpet Task:
		1.1 create a custom class for the Carpet class that should contain the following:
                Attributes:
                        width, length, unitPrice, isPersian (boolean)

				Add a constructor to set all the instances

                Actions:
                    calcCost(): should be able to calculate the total cost of the carpet and return it as double
                    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */