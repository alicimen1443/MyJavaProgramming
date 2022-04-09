package day17_While_DoWhile;

import java.util.Scanner;

public class Task4Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator");
        String operator =scan.next();

        String operators ="+-*/";
        int result=0;

        while(!(operators.contains(operator))){
            System.out.println("Invalid math operator. Please type a valid operator");
            operator =scan.next();
        }
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.println(num1 +" "+ operator+" " + num2 + " = " +" "+ result);






















    }
}

/*
 write a program to ask user to enter two number and math operator, and return the result.

if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */
