package day14_String;

import java.util.Scanner;

public class PracticeTask4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word");
        String firstWord = scan.next();
        System.out.println("Enter the second word");
        String secondWord = scan.next();
        scan.close();



        if(firstWord.charAt(firstWord.length()-1)==secondWord.charAt(0)){
            System.out.println(firstWord+secondWord.substring(1));
        }else{
            System.out.println(firstWord+secondWord);
        }




    }
}

/*
 4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last word is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
