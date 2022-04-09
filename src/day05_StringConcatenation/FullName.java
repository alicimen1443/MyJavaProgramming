package day05_StringConcatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Ali";
        String lastName = "Cimen";
        int age = 34;
        String jobTitle ="SDET";
        String companyName ="Apple Inc";
        double salary = 100000.58;


        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        //Full name of the person is ______

        System.out.println("Full name of the person is " + fullName);
        //___is___years old

        System.out.println(fullName + " is " + age + " years old");

        //FullName is JobTitle +, works at + CompanyName, and FullName's salary is ____

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and " + fullName + "'s salary is $" + salary);


    }
}

/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
 */
