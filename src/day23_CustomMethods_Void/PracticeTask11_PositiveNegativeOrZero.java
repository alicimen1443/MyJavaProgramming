package day23_CustomMethods_Void;

public class PracticeTask11_PositiveNegativeOrZero {
    public static void main(String[] args) {

        positiveOrNegative(-9);

    }


    public static void positiveOrNegative(int number){

        String s =(number>0)?"Positive":(number<0)?"Negative":"Zero";
        System.out.println(s);
    }
}

/*
12. create a method that can if the given integer is positive, negative or zero
 */
