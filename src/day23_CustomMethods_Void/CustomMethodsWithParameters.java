package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

       // oddOrEven(); // the method demands additional info to complete its task

        oddOrEven(10);
        ageOfPerson(1988);
        printNumbers(10,20);

    }

    //create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }


    }

    //create a fuction that can display the age of the person
    public static void ageOfPerson(int birthYear){

        int age = 2022 - birthYear;
        System.out.println("Your age is: "+age);

    }

    public static void printNumbers(int x, int y){
        for (int i = x+1; i <y ; i++) {
            System.out.print(i+" ");
        }

    }




}
