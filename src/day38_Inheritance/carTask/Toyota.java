package day38_Inheritance.carTask;

public class Toyota extends Car{

    //Is there a way I can take out if there is any unnecessary parameters are given in constructor.
    //Do I need an argument to set the brand?no, because all the cars from toyota class will have the same brand
    //so the data is already known.We don't need an argument.The only time that you will pass the parameter
    //when there is unknown information that must be given to the method
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }


    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }


    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);

    }


}
/*
Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()

 */