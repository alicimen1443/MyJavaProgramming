package day13_StringClass;

import java.util.Scanner;

public class ReturnInitials {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter first word");
        String first= scan.next();
        System.out.println("Enter second word");
        String second= scan.next();
        scan.close();

        char f =first.charAt(0);
        char s=second.charAt(0);

        String result=f+"."+s;

        System.out.println("result: " + result);







    }
}
/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */
