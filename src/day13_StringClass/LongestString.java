package day13_StringClass;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first sentence");
        String firstSentence= scan.nextLine();

        System.out.println("Enter the second sentence");
        String secondSentence= scan.nextLine();
        scan.close();

        int l1=firstSentence.length();
        int l2=secondSentence.length();

        if(l1>l2){
            System.out.println(firstSentence);
        }
        else if(l2>l1){
            System.out.println(secondSentence);
        }else{
            System.out.println("equal length");
        }




}
}

/*
2. write a program that asks user to enter two strings,
 and print out the longest string
 */
