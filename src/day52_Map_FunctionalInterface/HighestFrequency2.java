package day52_Map_FunctionalInterface;

import java.util.*;

public class HighestFrequency2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("java","java","python","c#"));

        Map<String,Integer> result = new LinkedHashMap<>();

        int highestFrequency=0;
        String highestStr="";

        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            result.put(each,frequency);

            if(frequency>highestFrequency){
                highestFrequency=frequency;
                highestStr=each;
            }

        }

        System.out.println(result+"\nelement "+highestStr+" has the highest frequency");


    }
}
/*
Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency

 */