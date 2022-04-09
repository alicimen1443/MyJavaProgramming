package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!  @#$%WoodenSpoon";

        //12345
        //CydeoWoodenSpoon
        //!@#$%

        String digits =""; //12354
        String letters =""; //CydeoWoodenSpoon
        String specialChars =""; //!@#$%

        for (int i = 0; i <str.length() ; i++) {  // index numbers of str (0~last index)

           char ch = str.charAt(i); // ch:each character that we have in str
            if(ch>='0'&& ch<='9'){
                digits+=ch;
            }
            else if( ch >= 'a'&& ch <= 'z'|| ch >= 'A'&& ch <= 'Z' ){
                letters+=ch;
            }else{
                if(ch != ' '){  //if the special character is not a space
                specialChars+=ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
