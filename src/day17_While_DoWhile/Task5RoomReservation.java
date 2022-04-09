package day17_While_DoWhile;

import java.util.Scanner;

public class Task5RoomReservation {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String answerYesOrNo=scan.next().toLowerCase();
        while(!(answerYesOrNo.equals("yes")||answerYesOrNo.equals("no"))){
            System.out.println("Invalid answer. Please re-enter");
            answerYesOrNo=scan.next().toLowerCase();
        }
        scan.nextLine();
        switch (answerYesOrNo){
            case "no":
                System.out.println("Have a nice day");break;
            case "yes":
                System.out.println("Which type of room do you want to reserve?");
                String roomType=scan.nextLine().toLowerCase();

                while(!(roomType.equals("king bed")||roomType.equals("queen bed")||
                        roomType.equals("single bed"))){
                    System.out.println("Invalid room type, please re-enter");
                    roomType= scan.nextLine().toLowerCase();
                }
                switch (roomType){
                    case "king bed":
                        System.out.println("King Bed==>120$");break;
                    case "queen bed":
                        System.out.println("Queen Bed==>100$");break;
                    case "single bed":
                        System.out.println("Single Bed==>80$");
                }
                /*
                total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

        System.out.println("Your total price is: $" + total);

                 */

        }
        scan.close();



    }
}
/*
5. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */
