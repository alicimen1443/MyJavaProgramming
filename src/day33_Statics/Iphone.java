package day33_Statics;

public class Iphone {

    public static String brand ="Apple";
    public String model; // If they are instance, they belong to the object
    public double price;
    public static String OS = "IOS"; // If they are static, they belong to the class. We can call them through the classnames.
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;

  //  public static void printModelAndPrice(){
      //  System.out.println(model+" : "+price); // static methods in java does not accept instances
   // }

    public static void printOperatingSystem(){ // first advantages of creating static method is, one copy of this method will be shared by all the objects
        System.out.println(OS);//second advantage is, when it comes to call the object, we don't have to create an object, we can call the method through the class name. So it takes less memory.
    }

    public void method1(){ // instance method can share instance variable and static variable but static method it can only share static variables
        System.out.println(model+" : "+price);
        System.out.println(OS);

    }

    //Whether it is instance method or static method, both of them are the methods at the end of the day.Instance method, you have to call it through the object because each of the object has separate copy
    //Static method , you can call it through the class and that static will be shared by all the objects
    //If the method that you are going to create if it needs to use instance variables, then it cannot be static. If it does not use any instance variables it can be static





}
