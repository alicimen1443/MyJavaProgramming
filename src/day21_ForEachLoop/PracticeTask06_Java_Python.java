package day21_ForEachLoop;

import java.util.Arrays;

public class PracticeTask06_Java_Python {
    public static void main(String[] args) {

        String sentence= "i love java programming language i love python i love python and java";

        String[] arr = sentence.split(" ");

        System.out.println(Arrays.toString(arr));
        int countJava = 0;
        int countPython=0;

        for (String each : arr) {

            if(each.toLowerCase().contains("java")){
                countJava++;
            }
            if(each.toLowerCase().contains("python")){
                countPython++;
            }
        }
        System.out.println("\"Java\" appearance number is: "+countJava+"\n\"Python\" appearance number is: "+countPython);




    }
}

/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */
