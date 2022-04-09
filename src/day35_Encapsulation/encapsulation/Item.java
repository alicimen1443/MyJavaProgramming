package day35_Encapsulation.encapsulation;

public class Item {

    private String name;
    private int quantity;
    private double unitPrice;

    public Item(String name, int unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){

        if(!startsWith(name)||emptyOrBlank(name)||containSpecialChar(name)){
            System.out.println("name cannot be empty or blank\nname cannot contain any special chars other than space\nname must start with letters");
            System.exit(0);
        }
        this.name =name;

    }
    public boolean containSpecialChar(String str){

        if(str.contains(" ")){
            str=str.replaceAll(" ","");
        }

        for (char each : str.toCharArray()) {
            if(!Character.isLetterOrDigit(each)){
                return true;
            }
        }
        return false;
    }

    public boolean startsWith(String str){
         return Character.isLetter(str.charAt(0));
    }

    public boolean emptyOrBlank(String str){
        return str.isEmpty()||str.isBlank();

    }


    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        if(unitPrice<0){
            System.exit(0);
        }
        this.unitPrice=unitPrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        if("Toilet paper".equalsIgnoreCase(getName())&&quantity>1){
            System.err.println("you cannot buy more than 1 toilet paper!");
            System.exit(0);
        }
        if(quantity<=0){
            System.err.println("quantity cannot be zero or negative!");
            System.exit(0);
        }
        this.quantity=quantity;
    }

    public double calcCost(){
        return quantity*unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost =" + calcCost() +
                '}';
    }
}
/*
4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */