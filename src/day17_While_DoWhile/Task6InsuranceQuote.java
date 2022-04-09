package day17_While_DoWhile;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task6InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println("Enter your gender (F or M)");
        String gender = scan.next().toLowerCase();
        double price=0;

        while(!(gender.equals("f")||gender.equals("m"))){
            System.out.println("Invalid entry, please re-enter your gender ( F or M)");
            gender= scan.next().toLowerCase();
        }
        System.out.println("Are you married?( yes or no)");
        String married =scan.next().toLowerCase();

        while(!(married.equals("yes")||married.equals("no"))) {
            System.out.println("Invalid entry, please re-enter ( yes or no)");
            married = scan.next().toLowerCase();
        }
        System.out.println("How old are you?");
        int age=scan.nextInt();

        while(!(age>0 && age <120)){
            System.out.println("Invalid entry, please re-renter your age");
            age= scan.nextInt();
        }
        System.out.println("How many miles do you drive in a day?");
        int miles = scan.nextInt();

        while(!(miles>=5)){
            System.out.println("Invalid entry, please re-enter how many miles do you drive in a day");
            miles = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Do you want full coverage or liability insurance?");
        String insType= scan.nextLine().toLowerCase();

        while(!(insType.equals("full coverage")||insType.equals("liability insurance"))){
            System.out.println("Invalid entry,please re-enter the insurance type you want");
            insType= scan.nextLine().toLowerCase();
        }
        System.out.println("Have you ever had any accidents in 5 years (yes or no)");
        String accident = scan.next().toLowerCase();

        while (!(accident.equals("yes")||accident.equals("no"))){

            System.out.println("Invalid entry, please re-enter as (yes or no)");
            accident = scan.next().toLowerCase();
        }
        System.out.println("Do you have an anti-theft device? (yes or no)");
        String antiTheft=scan.next().toLowerCase();

        while (!(antiTheft.equals("yes")||antiTheft.equals("no"))){
            System.out.println("Invalid entry, please re-enter as (yes or no)");
            antiTheft=scan.next().toLowerCase();
        }
        if(age<25 && insType.equals("liability insurance")){
            price+=90;
            if(miles<=10){
                price+=10;
            }
            else if(miles<=50){
                price+=30;
            }else{
                price+=50;
            }
        }else if(age>=25 && insType.equals("liability insurance")){
            price+=50;
            if(miles<=10){
                price+=10;
            }
            else if(miles<=50){
                price+=30;
            }else{
                price+=50;
            }
        }
        else if (age<25 && insType.equals("full coverage")){
            price+=160;
            if(miles<=10){
                price+=20;
            }
            else if(miles<=50){
                price+=40;
            }else{
                price+=70;
            }
        }else if(age>=25 && insType.equals("full coverage")){
            price+=120;
            if(miles<=10){
                price+=20;
            }
            else if(miles<=50){
                price+=40;
            }else{
                price+=70;
            }
        }
        if(antiTheft.equals("yes")){
            price*=price*0.95;
        }
        if(accident.equals("yes")){
            price*=1.15;
        }else{
            price*=0.9;
        }
        if(married.equals("yes")){
            price*=0.95;
        }
        scan.close();
        System.out.println("Insurance price is: $");
    }
}

/*
Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
 */
