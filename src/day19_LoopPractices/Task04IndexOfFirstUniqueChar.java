package day19_LoopPractices;

import java.util.Scanner;

public class Task04IndexOfFirstUniqueChar {

    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count = 0 ;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println("The Index number of first unique char is "+ i);
                break;
            }

        }


    }
}

//4. Write a program that can return the index number of the first unique character.
