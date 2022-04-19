package Day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws ArithmeticException {

        System.out.println("Test Started");

        try{
            System.out.println(8/0);
        }catch (RuntimeException e){
            System.out.println("Catch block");
            e.printStackTrace();
        }

        System.out.println("Test Completed");
    }
}
