package day15_ForLoops;

import java.util.Scanner;

public class PracticeTask7Reverse {

    public static void main(String[] args) {

        System.out.println("Enter an input");
        String input =new Scanner(System.in).nextLine();
        String result ="";

        for (int i = input.length()-1 ; i >=0 ; i--) {

            char ch =input.charAt(i);
            result+=ch;
        }
        System.out.println(result);



    }
}


/*
7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */