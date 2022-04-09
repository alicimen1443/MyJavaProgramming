package day23_CustomMethods_Void;

public class PracticeTask03_EligibleAlcohol {
    public static void main(String[] args) {

        eligibleToBuyAlcohol(17);
    }

    public static void eligibleToBuyAlcohol(int number){
        if(number>=18){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }
    }

}

/*
3. create a method that can check if a person is eligible to buy alcohol
 */
