package day14_String;

import java.util.Scanner;

public class PracticeTask5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();


        if(word.charAt(0)>= '0' && word.charAt(0)<= '9'){   // or between 48 and 57
            System.out.println("first character is digit");
        }
        else if(word.charAt(0)>=65&&word.charAt(0)<=90){ //  or 'A' and 'Z'
            System.out.println("first character is uppercase letter");

        }
        else if(word.charAt(0)>=97&&word.charAt(0)<=122){  //or 'a' and 'z'
            System.out.println("first character is lowercase letter");
        }else{
            System.out.println("first character is special character");
        }

        char ch = 100;

        System.out.println(ch);





    }
}

/*
5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */
