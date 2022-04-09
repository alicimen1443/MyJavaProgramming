package day09_IfStatements;

public class OxygenTank {

    public static void main(String[] args) {

        int tank = 50;
        String note = "Your tank is full";
        if(tank>=90){
            note = "Your tank is full";
        }
        else if(tank>=80 && tank<90){
            note = "Still okay";
        }
        else if(tank>=70 && tank<80){
            note = "Don't go too far";
        }
        else if (tank>=60 && tank<70){
            note="Start to head back";
        }
        else if (tank>=50 && tank<60){
            note="Be careful now you are at 50%";
        }
        else{
            note="none";
        }

        System.out.println(note);



    }
}

/*
4. Create a class called OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you are at 50%

                USE ONE PRINT STATEMENT ONLY
 */
