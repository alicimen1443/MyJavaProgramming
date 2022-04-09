package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        // White spaces are spaces that are not used
        String str1 = "    batch   25    ";
        str1=str1.trim();//"batch 25" // it trims the space character that is not between two characters
        //Strings are immutable there is no way we can modify the object of the string
        // it creates a new string
        System.out.println(str1);

        String str2="Cydeo School";

        int n1 = str2.indexOf("h"); // it checks the index number of the character
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); //specify the argument and it checks the first character of the argument
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("a "); // a and the space, then it goes to second a,it is the first time that a and space is occured
        System.out.println("n3 = " + n3);

        String str4 = "Java Programming Language";
        int n4 = str3.indexOf("amm"); // for a over there
        System.out.println("n4 = " + n4);

        int n5 =str4.indexOf("g ");
        System.out.println("n5 = " + n5);

        int n6 =str4.lastIndexOf("g");  // it checks from the last index
        System.out.println("n6 = " + n6);

        System.out.println("----------------------------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int thirdA=s.indexOf("a C");
        //int fourthA=s.indexOf("ava W");
        int fourthA = s.lastIndexOf("av");
        //int fifthA=s.lastIndexOf("va")+1;
        int fifthA=s.lastIndexOf("a W");
        int sixthA =s.lastIndexOf("aw");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);










    }
}
