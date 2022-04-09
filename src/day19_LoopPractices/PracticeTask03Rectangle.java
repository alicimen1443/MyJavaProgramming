package day19_LoopPractices;

import java.util.Scanner;

public class PracticeTask03Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the length of the rectangle:");
            int length = scan.nextInt();

            if (length <= 0) {
                System.err.println("Invalid entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the rectangle:");

            int width = scan.nextInt();
            if (length <= 0) {
                System.err.println("Invalid entry for the width of the rectangle");
                System.exit(0);
            }

            System.out.println("Area of the rectangle: " + (length*width));
            System.out.println("Perimeter of the square: " + (2*length*width));

            System.out.println("Would you like to calculate another rectangle?");
            String a = scan.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-enter");
                a= scan.next();
            }

            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo rectangle calculator APP");
                break;
            }
        }
        scan.close();



    }
}

/*
3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message
				"Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
