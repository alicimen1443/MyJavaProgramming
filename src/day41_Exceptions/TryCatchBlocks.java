package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test1 Started");

        try{
            System.out.println(9/0);

            System.out.println("Try block");

        }catch (ArithmeticException e){
            System.out.println("Catch block");

            System.out.println("Arithmetic Exception was occured");
        }


        System.out.println("Test1 Completed");

        System.out.println("--------------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try{
            System.out.println(numbers[200]);
            System.out.println("Try Block");

        }catch (RuntimeException e){ // Everytime when the exceptions occur during the run time catch block tries to catch it
// If we dont know what type of exception it is, then we pass Run time Exception because, it is the parent class of every runtime exceptions

            e.printStackTrace();  // This method gives full details of my exception after completing the code fragment
            //System.out.println(e.getMessage());
        }

        System.out.println("Test2 Completed");


        System.out.println("--------------------------------------------------");

        System.out.println("Test 3 started");

        try{
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();

        }
        System.out.println("Test3 finished");

        System.out.println("--------------------");

        System.out.println("Hello World");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println("-----------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
