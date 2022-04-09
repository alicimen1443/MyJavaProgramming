package day15_ForLoops;

import java.util.Scanner;

public class PracticeTask5Retrieve {
    public static void main(String[] args) {

        System.out.println("Enter an input");
        String input= new Scanner(System.in).next();

        String letters="";
        String digits= "";
        String specialChars ="";

        for (int i = 0; i < input.length(); i++) {
            char chr = input.charAt(i);

            if(chr>='0'&&chr<'9'){
                digits+=chr;
            }
            else if(chr>='a'&& chr<='z'||chr>='A'&& chr<='Z'){
                letters+=chr;
            }else{
                specialChars+=chr;
            }

        }
        System.out.println("specialChars = " + specialChars);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);






    }


}

/*
5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
