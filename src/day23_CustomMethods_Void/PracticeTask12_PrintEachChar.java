package day23_CustomMethods_Void;

public class PracticeTask12_PrintEachChar {
    public static void main(String[] args) {

        printEachChar("Java");


    }

    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }


    }
}

/*
13. create a method named printEachChar that can print each characters of a string
 */
