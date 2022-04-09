package day27_WrapperClasses;

public class PracticeTask03_RetrieveLetters {

    public static void main(String[] args) {
        String str = "Wooden Spoon!";
        String result = retrieve(str);
        System.out.println(result);
    }

    public static String retrieve(String str){

        String letters="";
        String digits="";
        String specialChars="";


        for (char each : str.toCharArray()) {
            if(Character.isLetter(each)){
                letters+=each;
            }else if(Character.isDigit(each)){
                digits+=each;
            }else{
                specialChars+=each;
            }
        }
        String output="letters ="+letters+"\nDigits ="+digits+"\nSpecial Chars ="+specialChars;
        return output;
    }


}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */