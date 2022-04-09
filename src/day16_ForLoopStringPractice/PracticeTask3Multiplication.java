package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PracticeTask3Multiplication {

    public static void main(String[] args) {
        int result=0;
        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 positive number");
        num1=scan.nextInt();
        num2=scan.nextInt();
        scan.close();

        if(num1>0&&num2>0){
            for (int i = 0; i <num1 ; i++){
                result+=num2;
            }
            System.out.println(result);
        }else{
            System.out.println("Invalid");
        }

    }
}

/*

3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */