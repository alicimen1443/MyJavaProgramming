package day31_Constructors;

public class SalaryObject {
    public static void main(String[] args) {

        SalaryCalculator person1 = new SalaryCalculator(20,40,0.10,0.15);

        System.out.println(person1);

        double salary = person1.salary();

        System.out.println("salary = " + salary);


    }
}
