package day14_String;

import java.util.Scanner;

public class PracticeTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word");
        String firstWord = scan.next();
        System.out.println("Enter the second word");
        String secondWord = scan.next();
        scan.close();


        String first=firstWord.substring(1);
        String second=secondWord.substring(1);

        System.out.println(first+second);

    }
}

/*
 1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
