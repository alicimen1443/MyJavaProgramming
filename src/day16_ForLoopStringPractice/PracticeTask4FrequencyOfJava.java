package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PracticeTask4FrequencyOfJava {

    public static void main(String[] args) {

        String sentence = new Scanner(System.in).nextLine();
        int count=0;

        for (int i = 0; i <= sentence.length()-4; i++) {

            if(sentence.substring(i,i+4).equals("java")){
                count+=1;
            }
        }
        System.out.println(count);


        //String word = "JAVA"
        //JAVA
        //5678
        //word.str(0,4)
        //i =5 i=9



    }
}

/*
4. write a program that can return the frequency of the  word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */
