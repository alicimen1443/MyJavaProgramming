package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];

        for (int i = 0,j='A'; i < letters.length ; i++,j++) { // i: index numbers 0 ~ last index
            letters[i]=(char)j;
        }
        System.out.println(Arrays.toString(letters));



      /*  char ch ='A';
        for (int i = 0; i < letters.length; i++,ch++) {   // [A~Z]
            letters[i]=ch;

       */
        System.out.println("-----------------------------------------");









        }
    }
