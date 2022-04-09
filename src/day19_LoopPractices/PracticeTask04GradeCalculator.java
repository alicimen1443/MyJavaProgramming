package day19_LoopPractices;

import java.util.Scanner;

public class PracticeTask04GradeCalculator {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        while(true) {
            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score < 0 && score > 100) {
                System.err.println("Invaild Entry");
                System.exit(0);
            }

            System.out.println((score > 89) ? "A" : (score > 79) ? "B" : (score > 69) ? "C" : (score > 59) ? "D" : "F");

            System.out.println("Would you like to continue?");
            String a = scan.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-enter");
                a = scan.next();
            }
            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");break;
            }

        }
        scan.close();





    }
}

/*
4. Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
 */
