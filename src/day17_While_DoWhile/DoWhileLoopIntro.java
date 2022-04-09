package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        boolean a =false;
        for (int i = 0; a;) {    //statement is never get executed when the condition is false
            System.out.println("Wooden Spoon--for loop");

        }

        System.out.println("--------------------------------------");

        while(a){            // statement is never get executed when the condition is false
            System.out.println("Wooden spoon--while loop");
        }

        System.out.println("--------------------------------------");

        do{   // do while loop executes the statement at least once even if condition is false. That is the only difference between those loops
            System.out.println("Wooden spoon--do while loop");
        }while (a);



    }
}
