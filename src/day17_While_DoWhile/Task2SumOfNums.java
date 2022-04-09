package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2SumOfNums {
    public static void main(String[] args) {

      /*  Scanner scan =new Scanner(System.in);
        while(true){
            System.out.println("Please enter first number:");
            int n1 = scan.nextInt();
            if(n1<0){break;}
            System.out.println("Please enter second number:");
            int n2 = scan.nextInt();
            if(n2<0){break;}
            System.out.println("Addition: "+ (n1+n2));
            }

       */

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int number = scan.nextInt();
            int sum = 0;

            while (number >= 0) {
                sum += number;
                System.out.println("Total sum = " + sum);
                System.out.println("Enter a new number:");
                number = scan.nextInt();

            }
            scan.close();
        }
    }








//2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
//            hint: you need an infinite loop
