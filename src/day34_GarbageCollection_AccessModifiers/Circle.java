package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers;

    public Circle(double radius){
        this.radius=radius;
        //pi=3.14; this is not the efficient way to initialize the static variable
    } //In java, constructor is for setting all the instances

    static { // static block allows me to set the static variables. Static block get execute automatically even outside the class
        pi=3.14;
        name="circle";
        numbers=new ArrayList<>();// if it takes multiple steps to set the static variables, we need to set it in the static block
        numbers.add(10);
        numbers.add(20);

    }//In java, static block is for setting the statics




   /* public static void main(String[] args) { // main method only runs inside the class, outside the class, you cannot run it

        pi=3.14;
        name="Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);;
    }

    */
}
