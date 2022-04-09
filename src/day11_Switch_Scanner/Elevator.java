package day11_Switch_Scanner;

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 3;
        String str="";
        boolean isValid = (floorNumber==1)||(floorNumber==2)||(floorNumber==3);

        if(isValid){
            switch (floorNumber){
                case 1 :
                    str="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2 :
                    str="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    str ="Floor 3 selected. Companies: Lyft, BofA, Stake house";

            }
        }else{
            str="Invalid floor-6";
        }
        System.out.println(str);



    }
}

/*
2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed



	Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the floor number from 1 to 3");
        int num = scanner.nextInt();
        String result = "";

        switch (num){
            case 1:
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                result = "Invalid floor - " + num;
        }
        System.out.println(result);

    }
}

 */
