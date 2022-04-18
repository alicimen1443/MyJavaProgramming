package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        try{        //NullPointerException
            System.out.println(employee.getSalary());// we can think try block as a fish

        }catch (IndexOutOfBoundsException e){ // and we can think catch blocks as people who are trying to catch the fish
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("------------------------------------------");

        try{
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }




    }
}
