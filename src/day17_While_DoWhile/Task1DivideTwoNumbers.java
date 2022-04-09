package day17_While_DoWhile;

public class Task1DivideTwoNumbers {
    public static void main(String[] args) {

        // This is an interview question

        int a = 30;
        int b= 7;
        int division =0;
        int remainder=0;

        while(a>=b){
            a-=b;
            division++;
            remainder=a;
        }

        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);














    }
}
//1. Write a program that can divide two positive numbers without using / (division) and
// * (multiplication) operators.
