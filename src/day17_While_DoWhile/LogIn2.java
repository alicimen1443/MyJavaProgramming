package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your user name");
        String u=scan.next();
        System.out.println("Please enter your password");
        String p = scan.next();
        boolean valid = u.equals("Cydeo") && p.equals("Cydeo123");

        for (int i = 1; i <=3 ; i++) {

            if(valid){
                System.out.println("Looged In");
                break;
            }else{
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Please enter your username");
                u=scan.next();
                System.out.println("Please enter your password");
                p = scan.next();
                if(i==3){
                    System.out.println("your account is locked");
                }

            }
        }
    }
}

/*

 2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

 Ask the user to enter their credentials.
         If credentials are matched, your program should print "Logged in."
         If the credentials are not matched, the program should allow the user to have three attempts
         to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}
 */
