package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment : =   (do not confuse this operator with equal operator that you have in math

        int number = 100;

        System.out.println("number = " + number); //100

        number= 200;

        System.out.println("number = " + number); //200

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";

        System.out.println("word = " + word);

        word = "Cydeo";

        System.out.println("word = " + word);  //Cydeo

        System.out.println("----------------------------------------------------------");

        //Addition Assignment:

        int x = 100;
        System.out.println("x = " + x);

        //x = x + 200;   // we have a shortcut for this operation
        x+= 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += "Spoon";
        System.out.println("str = " + str);

        double num1 =2.5;

        System.out.println("num1 = " + num1);

        num1 +=5.5;

        System.out.println("num1 = " + num1);  //8.0

        double availableBalance = 1000.50;

        //deposit 300$
        
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------------------------------");

        //withdrawing 500$

        availableBalance -= 500;

        System.out.println("availableBalance = " + availableBalance);

        //withdraw 200$, then depositing 400$

        availableBalance -= 200; //available balance = 600.5
        availableBalance += 400; //available balance = 1000.5

        System.out.println(availableBalance);

        System.out.println("-----------------------------------------");

         double salary = 50000.50;
         salary *=2;  // salary = salary * 2 it is the same result
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;

        dodge *= 1000000;
        System.out.println("dodge = " + dodge);

        System.out.println("-------------------------------------------------");

        double num2 = 25000;
        
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("--------------------------------------------------");

        double num3 = 100;

        // %=

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("----------------------------------------------------");

        int amount = 127;  //cent

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("--------------------");
        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("------------------------------------------------------");

        int y = 300;

        y %= 16;
        System.out.println("y = " + y);

        System.out.println("----------------------------------");

        int balance = 3500;

        //insurance fee : $153

        balance %= 153;

        System.out.println("balance = " + balance);









    }
}
