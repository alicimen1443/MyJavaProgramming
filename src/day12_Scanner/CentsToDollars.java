package day12_Scanner;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = input.nextInt();
        int dollars = cents/100;
        int remain = cents%100;

        System.out.println(cents+" cents equal to: "+dollars+" dollars and "+remain+" cents");
        input.close();

    }
}
/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */