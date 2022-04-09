package day15_ForLoops;

import java.util.Scanner;

public class PracticeTask8Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter a word");

        String word =new Scanner(System.in).nextLine(),
                result="";

        for (int i = word.length()-1; i >=0 ; i--) {
            char ch =word.charAt(i);
            result+=ch;
        }
        boolean isPalindrome = word.equalsIgnoreCase(result);
        System.out.println("isPalindrome = " + isPalindrome);
        
      //  if(word.equalsIgnoreCase(result)){
      //      System.out.println("isPalindrome = " + isPalindrome);
     //   }else{
     //       System.out.println("isPalindrome = " + isPalindrome);
     //   }
        
        }

    }


/*
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */
