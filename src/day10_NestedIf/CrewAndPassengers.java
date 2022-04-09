package day10_NestedIf;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int number =100;
        String str="";

        if(number==50||number==75||number==100){

            if(number==50){
                str="20 crew, 30 passengers";
            }
            else if(number==75){
                str="25 crew, 50 passengers";
            }else{
                str="30 crew, 70 passengers";
            }
        }else{
            str="Invalid number";
        }
        System.out.println(str);

        System.out.println("---------------------------------------");

        String str1 = (number==50||number==75||number==100)? (number==50)? "20 crew, 30 passengers" :
                (number==75)? "25 crew, 50 passengers" : "30 crew, 70 passengers" : "Invalid number";

        System.out.println(str1);

    }
}

/*
2. Create a class called CrewAndPassengers, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
