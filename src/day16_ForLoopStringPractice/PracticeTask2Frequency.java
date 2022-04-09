package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PracticeTask2Frequency {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.next();
        System.out.println("Enter a char");
        String ch = scan.next();
        scan.close();
        int frequency =0;

        for (int i = 0; i <str.length() ; i++) {
            String c ="" + str.charAt(i);
            if(c.equals(ch)){
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}

/*
2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
