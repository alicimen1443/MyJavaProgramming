package day09_IfStatements;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int score;
        System.out.println("Please enter your score");
        score=scan.nextInt();

        if(score>=0 && score <=100){
            if(score>=50){
                System.out.println("Passed");
            }
            else{
                System.out.println("Failed");
            }
        }
        else {
            System.out.println("Invalid Score");
        }
        System.out.println("Keep on hard working");

    }
}
