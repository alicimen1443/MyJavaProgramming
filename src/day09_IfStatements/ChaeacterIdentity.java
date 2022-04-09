package day09_IfStatements;

public class ChaeacterIdentity {
    public static void main(String[] args) {

        char chr ='@';
        if (chr>= 48 && chr<58){
        System.out.println("Digit");}
        else if(chr>=65 & chr <91 || chr>=97 && chr<122){
        System.out.println("Alphabetic Character");}
        else{
            System.out.println("Special Character");
        }




    }
}

/*
4. Create a class called Character Identity, and write a program that can identify if the given character
 is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */
