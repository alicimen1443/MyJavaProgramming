package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        //long,float,double,boolean we cannot use in switch statments

        int number = 9;

        switch(number){  //1,2,3,4,5,6,7
            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;//exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;//exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;//exits the switch after executing the case block
            case 5:
                System.out.println("Friday");
                break;//exits the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;//exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break;
            default : //only gets executed if none of the case blocks are matching
                System.out.println("Invalid");
                break;  //optional because we have curly braces at the very end

        }

    }
}
