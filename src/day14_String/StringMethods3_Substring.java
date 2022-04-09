package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        //substring(beginning index, ending index)

        String word = "Cydeo School";
        //             012345...
        String brand = word.substring(0,5);  // ending index always excluded

        System.out.println(brand);

        String str1 =word.substring(6); // if you print the substring from index 6 till the end,you don't have to give ending index
        System.out.println("str1 = " + str1);

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0,word2.indexOf(" "));  // "Java"
        System.out.println("s1 = " + s1);

        String s2 = word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));  // "Programming"
        System.out.println("s2 = " + s2);


        String s3 = word2.substring(word2.lastIndexOf(" ")+1); // "Language"
        System.out.println("s3 = " + s3);







    }

}
/*











 */
