package day08_IfStatements;
/*
Always Remember:
IF statement is all about creating boolean expression.The first thing that you need to do is to create the
right boolean expression.Otherwise your code is going to have a bug.

 */

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 301;

     /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
      */

        boolean evenNumber = number%2 == 0;
        boolean oddNumber = !evenNumber;

        if(evenNumber) {

            System.out.println(number + " is even number");
        }
        if(oddNumber){    //odd number

            System.out.println(number+ " is odd number");
        }

        System.out.println("----------------------------------");

        int n = 0;
        //positive
        if(n>0){
            System.out.println(n+ " is positive");
        }
        //negative
        if(n<0){
            System.out.println(n+ " is negative");
        }
        //zero
        if(n==0){
            System.out.println(n + " is zero");
        }




    }
}
