package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483647;  //the smallest integer number in java.Any user entered number will be greater than -2147483648

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();  //1, 2, 3, 4, 5

            if(num>max){
                max=num;
            }
        }

        System.out.println("max = " + max);

    }
}

/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */
