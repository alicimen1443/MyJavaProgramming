package day37_Inheritance.phoneTask;

public final class Samsung extends Phone{


    public Samsung(String model, String size, int price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }
}
/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */