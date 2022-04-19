package Day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("------Push up started--------");

        for (int i =1 ; i <=30 ; i++) {
            System.out.print("\rPush up "+i);// this \r escape sequence is rewrites the print statement on the same line
            sleep(1.5);
        }

        System.out.println("\n------------Push ups completed---------------");

        System.out.println("----------Pull up started----------");

        for (int i =1 ; i <=20 ; i++) {
            System.out.print("\rPull up "+i);// this \r escape sequence is rewrites the print statement on the same line
            sleep(1.5);
        }

        System.out.println("\n------------Pull ups completed---------------");

    }


    public static void sleep(double seconds){ // we create a custom method to handle all the exceptions instead of handling each of them one by one

        try {
            Thread.sleep((long)(1000*seconds));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */