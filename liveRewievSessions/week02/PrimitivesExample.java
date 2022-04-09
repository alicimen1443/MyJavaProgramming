package week02;

public class PrimitivesExample {
    public static void main(String[] args) {

        byte num1; //declaring a variable
        num1 = 123; //Initializing variable, assigning a value
        num1 = 121; // re assign a value
        short num2 = 12398; // Declare and initialize at the same line
        int distance = 1_000_000_000;
        long distanceMore = 3_000_000_000L; // we have to put L to define the variable
        long distanceShorter = 2_000_000_000; //if it doesn't pass the limit then we don't have to give the char

        float rate = 1000.5F;
        double dNum = 123.8;

        System.out.println("-----castings-------");

        System.out.println("Before Swapping Values");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // you might need to swap or re-assign some different range of values

        num2 = num1; // I am assigning num1 value to num2
        // implicit casting, Widening, done by the compiler
        System.out.println("After swapping");
        System.out.println("num2 = " + num2);


        System.out.println("Expilict Casting");
        num2 = (short) distance;  // narrowing, done manually, possibility of loosing data
        System.out.println("num2 = " + num2); // concatination

        System.out.println("Explicit casting of floating points");
        short rateTwo = (short) rate;
        System.out.println("rateTwo = " + rateTwo);






    }


}
