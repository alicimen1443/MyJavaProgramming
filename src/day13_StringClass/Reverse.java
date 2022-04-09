package day13_StringClass;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();


        if(word.length()==5){
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }
        else if(word.length()>5){
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }




    }
}

/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */
/*
Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        scan.close();

        String result = "";

        if(word.length() ==  5){
            result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);
        }else if(word.length() > 5){
            result = "Too long!";
        }else{
            result = "Too short!";
        }

        System.out.println(result);
 */
