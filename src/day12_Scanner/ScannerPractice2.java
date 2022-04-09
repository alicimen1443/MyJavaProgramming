package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //System.out.println("Enter true or false");
       // boolean result = scan.nextBoolean();

        String name = scan.next(); //  reads the input until a space
        System.out.println("name = " + name);

        scan.close();




    }
}
