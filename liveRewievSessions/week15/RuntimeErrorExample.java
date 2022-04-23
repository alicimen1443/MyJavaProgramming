package week15;

import java.util.Scanner;

public class RuntimeErrorExample {
    public static void main(String[] args) {

        System.out.println("Hello");
        //if there is a line of code that I might get exception
        int x = 5;
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();

        try{
            System.out.println(x/y); // when user puts zero this line will be skipped
        }catch (RuntimeException e){


        }
        System.out.println("How are you today?");
        System.out.println("Some more lines");
        System.out.println("we swallowed the exception object");




    }
}
