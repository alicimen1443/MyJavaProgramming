package day15_ForLoops;

import java.util.Scanner;

public class PracticeTask3Factorial {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();
        int sum = 1;

        for (int i = number; i>=1; i--) {
            sum*=i;
        }
        System.out.println("Factorial: "+sum);

    }
}

/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
