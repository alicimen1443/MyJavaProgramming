package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exceptions :
        /*
        All the exceptions that are having Is a Relationship with the Run time Exception class
        is known as unchecked exception
         */

        int a = 10;
        int b = 0;

        // System.out.println(a / b); //Arithmetic exception
        //  System.out.println("Wooden Spoon"); It is not possible to continue the next step without handling the exception

        char[] characters = {'A','B','C'};
        //                    0   1    2

      //  System.out.println( characters[99] ); // IndexOutOfBoundsException

        Student student = null; // This null keyword means the object is not exist. That is what null is
        //now , the student object has never been created.So is it possible that I can use the instances of this object?

        //System.out.println(student.getName()); // NullPointer exception
        //student.study();

        final String str= "Wooden Spoon"; // if we make it final there is no way that object to be eligible for garbage collector
        //str = null;

       // System.out.println(str.toUpperCase()); //NullPointerException


        //checked Exception:

        System.out.println("Hello");

        //Thread.sleep(3000); // checked exception

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file");

        //System.out.println("Java".charAt(100));
        /*
        is compiler is okay with this exception right now?or am I getting an error?
    compiler is okay with it.If compiler did not get any problem with that then it is
    an unchecked exception
         */













    }
}
