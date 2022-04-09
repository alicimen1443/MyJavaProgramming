package day19_LoopPractices;

import java.util.Scanner;

public class Task02IndexNumOfFirstDuplicatedChar {

    public static void main(String[] args) {

        System.out.println("Enter a String:");

        String str = new Scanner(System.in).nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Index of first duplicated char is: "+i);
                break;
            }


        }


    }
}

//2. Write a program that can return the index number of the first duplicated character from a string
