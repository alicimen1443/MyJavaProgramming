package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1); //121, concatenation

        System.out.println(10+20); //30 Addition
        System.out.println(100-50); //50 Subtraction
        System.out.println(10*5); //50 Multiplication

        System.out.println(100/3); //33
        System.out.println((double) 100/3);
        System.out.println(100/3.0);
        System.out.println(100.0/3);
        System.out.println(10d/4); //2.5

        int a = 100;
        double b = a/6; // 16.0

        System.out.println(b);

        double c = a/6.0; //16.66666
        //double c = a/6d;
        //double c = (double)a/6;

        System.out.println(c);

        System.out.println(100D);

        System.out.println(10%4);

        System.out.println(20%5);

        System.out.println(20%6);

        int x=5,
            y=5,
            z=5;
         int p = x+y+z;

        System.out.println(p);



    }
}




/*

    +: Addition
    -: Subtraction
    *: Multiplication
    /: Division

            integer /integer ======>integer
            decimal /integer ======>decimal
            integer /decimal=======>decimal
            decimal /decimal=======>decimal

            in math
                10/4 = 2.5
            in java:
                10/4 = 2
                10.0/4 = 2.5
                10/4.0 = 2.5
    %: Remainder

 */
