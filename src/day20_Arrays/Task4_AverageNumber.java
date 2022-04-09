package day20_Arrays;

import java.util.Scanner;

public class Task4_AverageNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int limit = scan.nextInt();

        int[] numbers = new int[limit];
        double sum =0;

        for (int i = 0; i < limit; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();
            numbers[i]=number;
            sum+=number;
        }

        double average = sum/limit;

        System.out.println("average = " + average);

        scan.close();




    }
}

/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */
