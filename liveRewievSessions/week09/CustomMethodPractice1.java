package week09;

import com.sun.security.jgss.GSSUtil;

public class CustomMethodPractice1 {
    public static void main(String[] args) {

        int personOneAge =10;
        if(personOneAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }

        int personTwoAge =20;
        if(personTwoAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }

        int personThirdAge =30;
        if(personThirdAge>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible to buy");
        }

        System.out.println("----------------------------------");

        eligibleOrNot(personOneAge);
        eligibleOrNot(personTwoAge);
        eligibleOrNot(personThirdAge);

    }

        public static void eligibleOrNot(int age){ // no return type

        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }

}
