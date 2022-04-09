package day19_LoopPractices;

import java.util.Scanner;

public class Task01FirstDuplicatedChar {
    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str =new Scanner(System.in).nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count =0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==2){
                System.out.println("First duplicated char is: "+ str.charAt(i));
                break;
            }

        }


    }
}


//1. Write a program that can return the first duplicated character from a string