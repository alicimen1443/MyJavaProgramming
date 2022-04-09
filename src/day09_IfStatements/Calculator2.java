package day09_IfStatements;

public class Calculator2 {
    public static void main(String[] args) {


        double number1= 100,number2=20;
        char mathOp = '*';
        boolean valid = mathOp=='+' || mathOp=='-' || mathOp=='*' || mathOp=='/';
        double calculation = number1 + number2;


        if(!valid){
            System.out.println("Not valid operator");
        }else{
            if(mathOp=='+'){
                calculation=number1+number2;
            }
            else if(mathOp=='-'){
                calculation=number1-number2;
            }
            else if(mathOp=='*'){
                calculation=number1*number2;
            }
            else{
                calculation=number1/number2;
            }
        }

        System.out.println(number1+" " +mathOp+" "+number2+" = "+ calculation);










    }
}
