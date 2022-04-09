package day14_String;

import java.util.Scanner;

public class PracticeTask6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an account number");
        String number = scan.next();
        scan.close();


        if(number.charAt(0)=='2'){
            if(number.length()==7){
                System.out.println("valid");
            }
        }
        else if(number.charAt(0)=='5'){
            if(number.length()==10){
                System.out.println("valid");
            }
        }else{
            System.out.println("Invalid account number");
        }





    }
}

/*
 6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */
