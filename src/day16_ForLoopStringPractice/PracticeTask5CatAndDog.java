package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PracticeTask5CatAndDog {

    public static void main(String[] args) {

        System.out.println("Enter a sentence");
        String sentence = new Scanner(System.in).nextLine();
        int numberOfCat =0;
        int numberOfDog=0;

        for (int i = 0; i <= sentence.length()-3 ; i++) {

            if (sentence.substring(i, i + 3).equalsIgnoreCase("cat")) {
                numberOfCat ++;
            }
            if (sentence.substring(i, i + 3).equalsIgnoreCase("dog")) {
                numberOfDog ++;
            }
        }
            if(numberOfCat==numberOfDog){
                System.out.println(true);
            }else{
                System.out.println(false);
            }

            //catdogcatdogcatdog
           // 0123456789
          // word.substring(7,10)






    }
}

/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dog cAt"

	            output:
	                true

 */