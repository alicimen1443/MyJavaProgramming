package Day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        //disadvantage of throw keyword is whoever calls that method that contains the throw keyword in the method signature
        // the caller is responsible for handling this exception
        //sleep(2.5); // compiler error

        System.out.println("Hello World");

        System.out.println("--------------------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5);

        System.out.println("Cydeo");
    }

    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long) (1000 * seconds));


    }
}
