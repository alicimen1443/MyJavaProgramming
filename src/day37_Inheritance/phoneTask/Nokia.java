package day37_Inheritance.phoneTask;

public class Nokia extends Phone {

    public Nokia(String model, String size, int price, String color) {
        super("Nokia", "a", "b", 23, "sd");
    }

    public void selfDefense(){
        System.out.println("you can use "+brand+" "+model+" as self defense tool");
    }




}
/*
1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */