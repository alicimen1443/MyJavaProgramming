package day19_LoopPractices;

import java.util.Scanner;

public class Task03AllDuplicatedChars {
    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).nextLine();
        String result="";

        for (int i = 0; i < str.length(); i++) {

            int count=0;
            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==2){
               if(!(result.contains(str.charAt(i)+""))){
                   result+=str.charAt(i);

            }
        }
        }
        System.out.println(result);




    }
}

//3. Write a program that can display all the characters that appeared twice in the string.
