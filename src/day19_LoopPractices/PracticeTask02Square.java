package day19_LoopPractices;

import java.util.Scanner;

public class PracticeTask02Square {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the side of the square:");
            int side = scan.nextInt();

            if (side <= 0) {
                System.err.println("Invalid entry for the side of the square");
                System.exit(0);
            }
            System.out.println("Area of the square: " + (side*side));
            System.out.println("Perimeter of the square: " + (4*side));

            System.out.println("Would you like to calculate another square?");
            String a = scan.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-enter");
                a= scan.next();
            }

            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo square calculator APP");
                break;
            }
        }
        scan.close();


    }
}

/*
2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				 "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
