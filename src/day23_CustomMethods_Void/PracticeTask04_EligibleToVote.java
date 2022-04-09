package day23_CustomMethods_Void;

public class PracticeTask04_EligibleToVote {
    public static void main(String[] args) {

        eligibleToVote(25,"UK");


    }

    public static void eligibleToVote(int number,String country){
        if(number>=18&&country.equalsIgnoreCase("UK")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}

/*
4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */
