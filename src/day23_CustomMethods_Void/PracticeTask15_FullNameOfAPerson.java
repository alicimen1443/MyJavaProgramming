package day23_CustomMethods_Void;

public class PracticeTask15_FullNameOfAPerson {
    public static void main(String[] args) {

        fullNameOfAPerson("CyDEo","SCHOol");


    }
    public static void fullNameOfAPerson(String firstName,String lastName){

        firstName=firstName.toLowerCase();
        lastName=lastName.toLowerCase();
        String fullName = firstName.toUpperCase().charAt(0)+firstName.substring(1)+" "
                +lastName.toUpperCase().charAt(0)+lastName.substring(1);
        System.out.println(fullName);
    }
}

/*
16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */
