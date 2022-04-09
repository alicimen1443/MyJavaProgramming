package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double stateTaxP,
                federalTaxP;
        int hourlyRate,
                hoursInAWeek;

        System.out.println("Enter your hourly rate");
        hourlyRate=input.nextInt();
        System.out.println("Enter your work hours in a week");
        hoursInAWeek=input.nextInt();
        System.out.println("Enter the state tax percentage");
        stateTaxP=input.nextDouble();
        System.out.println("Enter the federal tax percentage");
        federalTaxP= input.nextDouble();
        input.close();

        int salary= hourlyRate*hoursInAWeek*52;
        double stateTax= salary*stateTaxP/100;
        double federalTax= salary*federalTaxP/100;
        double totalTax= stateTax+federalTax;
        double netIncome = salary-totalTax;

        System.out.println("salary = $" + salary);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("netIncome $= " + netIncome);

    }
}

/*
3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */
