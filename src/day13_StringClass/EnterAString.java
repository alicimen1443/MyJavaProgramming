package day13_StringClass;

import java.util.Scanner;

public class EnterAString {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string");
        String s= scan.nextLine();
        scan.close();
        int length=s.length();
        char three=s.charAt(s.length()-3);
        char two= s.charAt(s.length()-2);
        char one=s.charAt(s.length()-1);

        if(length==0){
            System.out.println("String is empty");
        }
        else if(length>3){
            System.out.println(""+s.charAt(s.length()-3)+s.charAt(s.length()-2)+s.charAt(s.length()-1));
        }else{
            System.out.println(s);
        }






    }

}
/*
5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
