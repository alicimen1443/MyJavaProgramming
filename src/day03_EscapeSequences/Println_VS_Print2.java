package day03_EscapeSequences; //package name of the class

public class Println_VS_Print2 {
    public static void main(String[] args) { // main method
        System.out.println("Knock Knock"); //first it prints knock knock, then it appends a new line
        System.out.println("Who is this?");
        System.out.println("This is Java");
        System.out.println("---------------------");
        System.out.print("Knock Knock"); // it prints knock knock, then does not append a new line
        System.out.print("who is this?");
        System.out.print("This is Java");
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Hello everyone,how are you all today? Today we will learn Escape Sequences , and next week we will learn variables");

        System.out.print("Hello everyone,how are you all today?");
        System.out.print("Today we will learn Escape Sequences ,");
        System.out.print("and next week we will learn variables");

    }
}
//Single line goes here

/*
Topics:
    println method
    print method
    comments
     */
