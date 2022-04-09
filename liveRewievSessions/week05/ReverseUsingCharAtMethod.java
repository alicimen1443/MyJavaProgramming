package week05;

import java.util.Scanner;

public class ReverseUsingCharAtMethod {
    public static void main(String[] args) {

        //what is palindrome? "madam" when you reverse :"madam" again || KAYAK is palindrome
        //check for  5 characters word, and without methods that we didn't learn

        String word = "hello";

        String reversedWord ="";

        reversedWord+=word.charAt(4);
        reversedWord+=word.charAt(3);
        reversedWord+=word.charAt(2);
        reversedWord+=word.charAt(1);
        reversedWord+=word.charAt(0);

        if(word.equals(reversedWord)){
            System.out.println("The word is Palindrome");
        }else{
            System.out.println("The word is NOT palindrome");
        }

    }
}
