package day18_NestedLoop;
import java.util.Scanner;
public class Task3CalculateTwoNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(true) {
            System.out.println("Enter the first number");
            double n1 = scan.nextDouble();

            System.out.println("Enter a math operator");
            String validOp = "+-*/";
            String mathOp = scan.next();
            while (!(validOp.contains(mathOp))) {
                System.out.println("Invalid entry,please re enter math operator");
                mathOp = scan.next();
            }
            System.out.println("Enter the second number");
            double n2 = scan.nextDouble();
            switch (mathOp) {
                case "+":
                    System.out.println("result: " + (n1 + n2));
                    break;
                case "-":
                    System.out.println("result: " + (n1 - n2));
                    break;
                case "*":
                    System.out.println("result: " + (n1 * n2));
                    break;
                case "/":
                    System.out.println("result: " + (n1 / n2));
                    break;
            }
            System.out.println("Do you want to continue?(yes or no)");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid entry, please type yes or no");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");break;
            }

        }
    }
}

/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */
