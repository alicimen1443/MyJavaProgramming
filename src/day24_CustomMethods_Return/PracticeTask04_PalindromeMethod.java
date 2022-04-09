package day24_CustomMethods_Return;

public class PracticeTask04_PalindromeMethod {
    public static void main(String[] args) {

        String word = "level";

        boolean isPalindrome=isPalindrome(word);

        System.out.println(isPalindrome);

    }

    public static boolean isPalindrome(String str){

        String reverse ="";
        for (int i = str.length()-1; i >=0 ; i--) {

            reverse+=str.charAt(i);
        }
        boolean isPalindrome = str.equalsIgnoreCase(reverse);
        return isPalindrome;
    }
}
/*
4. By using the reverse method above to create another method named isPalindrome
  that passes a String parameter, the method returns true if the string is palindrome,
   otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

 */
