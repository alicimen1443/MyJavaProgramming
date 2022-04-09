package day15_ForLoops;

public class ReverseAnyGivenString {

    public static void main(String[] args) {

        String str = "Java";
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {

            char ch= str.charAt(i);
            result+=ch;

        }
        System.out.println(result);


    }
}

/*


Tasks:
	1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */
