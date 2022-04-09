package java_Shorts;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1.Ask the user to enter an integer number
        System.out.println("Enter an integer number:");
        int num1 = input.nextInt();


        //2.Ask the user to enter a decimal number
        System.out.println("Enter an decimal number:");
        double num2= input.nextDouble();

        //3.Ask user to enter a word
        System.out.println("Enter a word:");
        String str = input.next();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("str = " + str);

        System.out.println("--------------------------------------");







    }
}
