package day18_NestedLoop;

public class NestedLoopPractice3 {

    public static void main(String[] args) {

       /* String asteriks = "* " ;

        for (int i = 1; i <=10 ; i++) {
            System.out.println(asteriks.repeat(i));

        */
        /*
        String output = "";
        for (int i = 1; i <=10 ; i++) {
            output += "* " ;
            System.out.println(output);

        }

         */
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");

    }
}
}

/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */
