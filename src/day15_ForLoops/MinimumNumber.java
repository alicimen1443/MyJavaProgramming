package day15_ForLoops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647 ;  //Any user entered number will be less than 2147483648

        for (int i =10; i < 15; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();  //1, 2, 3, 4, 5

            if(num<min){
                min=num;
            }
        }

        System.out.println("min = " + min);

    }
}

/*
Write a program that asks the user to enter a number for 5 times.
return the minimum number
 */