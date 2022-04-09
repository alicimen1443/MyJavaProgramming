package day09_IfStatements;

import java.util.Scanner;

public class SalaryAfterTax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please,enter your salary");
        double salary,salaryAfterTax,taxRate;
        salary= scan.nextDouble();
        boolean isMarried;
        System.out.println("Are you married?(true/false)");
        isMarried= scan.nextBoolean();
        if(salary>= 130000){
            taxRate= 0.35;
        }
        else if(salary>=100000){
            taxRate= 0.30;
        }
        else if(salary>=80000){
            taxRate=0.25;
        }
        else {
            taxRate = 0.20;
        }
        if(isMarried==true){
            taxRate = taxRate - 0.05;
        }
        salaryAfterTax = salary - (salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);




    }

}




       /* double salaryAfterTax,taxRate;
        boolean isMarried= true;

        if(salary>= 130000){
            taxRate= 0.35;
        }
        else if(salary>=100000 && salary<130000){
            taxRate= 0.30;
        }
        else if(salary>=80000 && salary<10000){
            taxRate=0.25;
        }
        else {
            taxRate = 0.20;
         }
        if(isMarried==true){
            taxRate = taxRate - 0.05;
        }
        salaryAfterTax = salary - (salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);

    }
}

/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
 */
