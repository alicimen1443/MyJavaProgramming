package utilities;

import java.util.Arrays;

public class MathUtility {
   /* public static void main(String[] args) {


        int n1=100,n2 =20;
        double num1=75.5,num2=15.5;

        System.out.println(sum(n1,n2));
        System.out.println(cube(n2));
        System.out.println(oddOrEven(n1));
        System.out.println(max(num1,num2));
        System.out.println(multiplication(n1,n2));

    }

    */

    //returns sum of two integers
    public static int sum(int num1,int num2){

        return num1+num2;
    }

    //returns sum of two doubles
    public static double sum(double num1,double num2){

        return num1+num2;
    }

    //returns subtraction of two integers
    public static int subtraction(int num1,int num2){

        return num1-num2;
    }

    //returns subtraction of two doubles
    public static double subtraction(double num1,double num2){

        return num1-num2;
    }

    //returns multiplication of two integers
    public static int multiplication(int num1,int num2){

        return num1*num2;
    }

    //returns multiplication of two doubles
    public static double multiplication(double num1,double num2){

        return num1*num2;
    }

    //returns division of two doubles
    public static double division(double num1,double num2){

        return num1/num2;
    }

    //checks if an integer is even or odd
    public static String oddOrEven(int number){

        String result="";
        if(number%2==0){
            result="Even number";
        }else{
            result="Odd number";
        }
        return result;
    }

    //return maximum number between two integers
    public static int max(int num1,int num2){
        int max=0;
        if(num1==num2){
            System.err.println("Please enter two different numbers");
            System.exit(0);
        }
        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        return max;
    }

    //return maximum number between two doubles
    public static double max(double num1,double num2){
        double max=0;
        if(num1==num2){
            System.err.println("Please enter two different numbers");
            System.exit(0);
        }
        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
        return max;
    }

    //return minimum number between two integers
    public static int min(int num1,int num2){
        int min=0;
        if(num1==num2){
            System.err.println("Please enter two different numbers");
            System.exit(0);
        }
        if(num1>num2){
            min=num2;
        }else{
            min=num1;
        }
        return min;
    }

    //return minimum number between two doubles
    public static double min(double num1,double num2){
        double min=0;
        if(num1==num2){
            System.err.println("Please enter two different numbers");
            System.exit(0);
        }
        if(num1>num2){
            min=num2;
        }else{
            min=num1;
        }
        return min;
    }

    //returns the square of an integer
    public static int square(int number){

        return number*number;
    }

    //returns the square of a double
    public static double square(double number){

        return number*number;
    }

    //returns the cube of an integer
    public static int cube(int number){

        return number*number*number;
    }

    //returns the cube of a double
    public static double cube(double number){

        return number*number*number;
    }

}
/*
2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals

			2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division reslt

			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double

 */

