package day23_CustomMethods_Void;

public class PracticeTask14_Calculator {
    public static void main(String[] args) {

        calculator(5,6,"*");


    }

    public static void calculator(int num1,int num2,String charOperator){

        switch (charOperator){
            case "+":
                System.out.println(num1+num2);break;
            case "-":
                System.out.println(num1-num2);break;
            case "*":
                System.out.println(num1*num2);break;
            case "/":
                System.out.println(num1/num2);break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

/*
15. create a method named calculator that passes three arguments
 (num1, num2, mathOperator), prints the calculation result
 */
