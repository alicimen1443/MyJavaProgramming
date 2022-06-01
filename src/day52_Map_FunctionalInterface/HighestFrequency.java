package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestFrequency {
    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        String[] arr = str.split("");

        Map<String,Integer> result = new LinkedHashMap<>();

        int highestFrequency=0;
        String highestChar="";

        for (String eachCharachter : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),eachCharachter);
            result.put(eachCharachter,frequency);
            if(frequency>highestFrequency){
                highestFrequency=frequency;
                highestChar=eachCharachter;

            }
        }
        System.out.println(result+"\ncharacter "+highestChar+" has the highest frequency");


    }
}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency
 */