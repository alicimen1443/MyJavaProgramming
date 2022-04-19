package Day42_Exceptions;

class FadyException extends RuntimeException { // custom unchecked exception

    public FadyException() {
        super("It's time for break");
    }

    public FadyException(String message) {
        super(message);
    }

}

class NoBreakException extends Exception { // custom checked exception

}

public class CustomExceptions {
    public static void main(String[] args)  {

        // throw new FadyException(); // I created an object with default constructor
        // throw new FadyException("It's time for lunch"); // I created an object with parameter constructor


        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }


}
