package day19_LoopPractices;

import java.util.Scanner;

public class PracticeTask06HighestFrequency {

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();

        int maxFrequency = 0;
        char ch=0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            if(count>maxFrequency||count==maxFrequency){
                maxFrequency=count;
                ch=str.charAt(i);
            }
        }

        System.out.println("ch = " + ch);
        System.out.println("maxFrequency = " + maxFrequency);



    }
}


/*
6.  Write a program that can find the character that has the highest frequency from a string
 */