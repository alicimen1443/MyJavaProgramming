package day13_StringClass;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Do you have a valid passport? (Yes/No)");
        String validPassport= scan.next().toLowerCase();


        if(validPassport.equals("yes")){
            int cost=1000;
            scan.nextLine();
            System.out.println("Which country are you traveling to?");
            String country=scan.nextLine();
            System.out.println("How many bags do you have?");
            byte numberOfBags = scan.nextByte();
            cost+=50*numberOfBags;
            System.out.println("How many people are you travelling with?");
            short numberOfPeople=scan.nextShort();
            if(numberOfPeople<=3){
                cost-=numberOfPeople*100;
            }else{
                cost-=300;
            }
            scan.nextLine();
            System.out.println("Enter the name of travel you will travel with");
            String names=scan.nextLine();

            System.out.println("Your ticket is bound to "+country+" We have charged extra for the "+numberOfBags+
                    " bags but you are travelling with "+ names+" so we are giving a discount. Your total cost is $"+cost);

        }else{
            int cost = 200;
            System.out.println("When did your passport expired?");
            int expiredYear= scan.nextInt();
            cost+= 75*(2022-expiredYear);
            scan.nextLine();
            System.out.println("Which country are you traveling to?");
            String country = scan.nextLine();
            System.out.println("Will you be traveling in the next year (yes or no)?");
            String answer = scan.next().toLowerCase();
            if(answer.equals("yes")){
                cost+=100;
            }else{
                cost-=100;
            }
            System.out.println("Looks like your passport has been expired for "+(2022-expiredYear)+" years,\n but not to worry we will get it ready for you to travel to "+country+" Your total cost has come out to $ "+cost);
            scan.close();



        }



    }
}
/*
3. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
            		 separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags
            		 bags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your passport has been expired for $years, but not to worry we will get it
        			 ready for you to travel to $allCountries. Your total cost has come out to $costAmount."
 */
