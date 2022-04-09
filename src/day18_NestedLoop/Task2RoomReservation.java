package day18_NestedLoop;
import java.util.Scanner;
public class Task2RoomReservation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int total =0;
        while(true) {
            System.out.println("Which bedroom do you want to reserve?(queen/king/single)");
            String roomType = scan.next().toLowerCase();

            while (!(roomType.equals("king") || roomType.equals("queen") || roomType.equals("single"))) {
                System.out.println("Invalid entry,please enter which bedroom do you want to reserve?");
                roomType = scan.nextLine().toLowerCase();
            }
            System.out.println("How many nights are you staying?");
            int night = scan.nextInt();

            while (!(night > 0)) {
                System.out.println("Invalid entry,please enter How many nights are you staying?");
                night = scan.nextInt();
            }
            total+=(roomType.equals("king bed")) ? 120*night : (roomType.equals("queen bed")) ? 100*night : 80*night;

            System.out.println("Would you like to reserve another room?(yes or no)");
            String anotherRoom = scan.next().toLowerCase();

            while (!(anotherRoom.equals("yes") || anotherRoom.equals("no"))) {
                System.out.println("Invalid entry,please type yes or no");
                anotherRoom = scan.next().toLowerCase();
            }
            if (anotherRoom.equals("no")) {
                System.out.println("Your total price is: $"+total);
                break;
            }
            System.out.println("Your total price is: $"+total);
        }
        scan.close();
    }
}

/*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
