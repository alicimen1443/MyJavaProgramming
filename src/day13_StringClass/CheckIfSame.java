package day13_StringClass;

import java.util.Scanner;

public class CheckIfSame {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        String s = scan.next();
        scan.close();

        char first=s.charAt(0);
        char last=s.charAt(s.length()-1);

        if(first==last){
            System.out.println("same");
        }else{
            System.out.println("not the same");
        }



    }
}

/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */
