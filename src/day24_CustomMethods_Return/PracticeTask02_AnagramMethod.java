package day24_CustomMethods_Return;

import java.util.Arrays;

public class PracticeTask02_AnagramMethod {
    public static void main(String[] args) {

        String word1 = "listen to me";
        String word2 = "silent to me";
        boolean isAnagram =isAnagram(word1,word2);

        System.out.println(isAnagram);



    }

    public static boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram =(Arrays.equals(ch1,ch2));
        return isAnagram;
    }

}

/*
2. create a method named isAnagram that passes two String parameters,
 the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true

 */
