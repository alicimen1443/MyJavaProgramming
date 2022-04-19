package Day42_Exceptions;

import day31_Constructors.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {

        // we can either use default constructor or constructor with String parameter
        throw new NoSuchElementException("There is no such element as break");

        // System.out.println("hello world"); // I wont be able to write next code fragment. After the throw keyword it is impossible


       // throw new Rectangle(5,7); The throw keyword you can only apply for the classes that are having Is a Relationship with the throwable
        //If the class does not have Is a relationship with the throwable then you cannot apply the throw keyword
        // so the object has to be exception object

    }

}
