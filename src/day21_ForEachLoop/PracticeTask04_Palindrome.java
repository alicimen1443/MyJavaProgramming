package day21_ForEachLoop;

public class PracticeTask04_Palindrome {
    public static void main(String[] args) {

        String[] words = {"anna","level","Java"};
        int count =0;

        for (String each : words) {
            String reversed="";

            for (int i = each.length()-1; i >=0; i--) {
                reversed+=each.charAt(i);
                }
            if(each.equalsIgnoreCase(reversed)){
                count++;

            }

        }
        System.out.println(count);


    }
}

/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */
