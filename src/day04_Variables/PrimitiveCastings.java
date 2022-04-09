package day04_Variables;

public class PrimitiveCastings {

    public static void main(String[] args) {

    // implicit casting:

        int a = 100;
        double b = a; //implicit casting

        System.out.println(a);
        System.out.println(b);

        //explicit casting:

        double x = 20.5;
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);

        int a1 = 1000;
        byte b1 = (byte) a1;
        System.out.println(a1);
        System.out.println(b1);


    }
}
