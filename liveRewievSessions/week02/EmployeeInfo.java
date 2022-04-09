package week02;

public class EmployeeInfo {

    public static void main(String[] args) {

        /*
        * name
        * companyName
        * jobTitle
        * gender----char(M/F)
        * salary ----- double
        * employeeID -----int
        * hasBenefits(Y/N)----boolean  true/false
        * isMarried----char   Y/N
         */

        String name = "Ali ÇİMEN";
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        char gender = 'M';
        double salary = 120_000;
        int employeeID = 12134;
        boolean hasBenefits = true;
        char isMarried = 'y';

        System.out.println("name = " + name);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("gender = " + gender);
        System.out.println("salary = " + salary);
        System.out.println("employeeID = " + employeeID);
        System.out.println("hasBenefits = " + hasBenefits);
        System.out.println("isMarried = " + isMarried);


    }
}
