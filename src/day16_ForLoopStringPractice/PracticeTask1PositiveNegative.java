package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PracticeTask1PositiveNegative {
    public static void main(String[] args) {

        int positiveNums=0;
        int negativeNums=0;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number");
            int number = new Scanner(System.in).nextInt();
            if(number<0){
                negativeNums++;
            }
            else if(number>0){
                positiveNums++;
            }
        }
        System.out.println(positiveNums+ " positive and "+negativeNums+" negative");


    }

}

/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
