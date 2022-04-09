package week03;

import java.util.Scanner;

public class Grader {

    public static void main(String[] args) {

        //for a given grade assign letter scores : 100-90: A, 89-80 :B, 79-70: C, 69-60:D, Below is F

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = scan.nextInt();
        String letter;

        if(score>=0 && score<=100) {
            System.out.println("Your score is valid.");
            if (score >= 90 && score <= 100) {
                letter = "A";
            } else if (score >= 80 && score < 90) {
                letter = "B";
            } else if (score >= 70 && score < 80) {
                letter = "C";
            } else if(score>=60 && score<70){
                letter = "D";
            }
            else{
                letter = "F";
            }
        }
            else{
                letter = "Not valid Score";
            }
        System.out.println(letter);








    }
}
