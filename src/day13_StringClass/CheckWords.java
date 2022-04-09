package day13_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter first word");
        String first =scan.next();

        System.out.println("Enter second word");
        String second =scan.next();

        System.out.println("Enter third word");
        String third =scan.next();

        if(first.length()==second.length()&&second.length()==third.length()){
            System.out.println("All words all the same length");
        }
        else if(first.length()!=second.length()&&first.length()!=third.length()&&second.length()!=third.length()){
            System.out.println("All different length");
        }else{
            System.out.println("Not same nor different lengths");
        }





    }
}

/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor
            Different lengths"
            - if all different length :  print "All different length"

 */
