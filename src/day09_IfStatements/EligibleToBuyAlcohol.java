package day09_IfStatements;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        String name ="John";
        int age =15;

        boolean isEligible = age>=18;

        if(isEligible){
            System.out.println(name + " is eligible to buy alcohol");
        }else{
            System.out.println(name + " is not eligible to buy alcohol");
        }
    }
}

/*
3. Write a progrm that can check if the person is eligible to buy alcohol
 */
