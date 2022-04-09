package day24_CustomMethods_Return;

public class PracticeTask03_ReverseMethod {
    public static void main(String[] args) {

        String str="Java programming language";

        str=reverseMethod(str);
        System.out.println(str);

    }

    public static String reverseMethod(String word){
        String reverse ="";

        for (int i = word.length()-1; i >=0 ; i--) {

            reverse+=word.charAt(i);
        }
        return reverse;
    }
}
/*
3. create a method named reverse that passes one string parameter,
the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ

 */
