package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score= input.nextInt();
        String grade ="";
        input.close();

        if(score>=0&&score<=100){
            grade = (score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D": "F";

        }else{
            grade="Invalid score";
        }
        System.out.println(grade);

    }
}

/*
90~100 :excellent
        80~89:great
        70~79:good
        60~69:passed
        0~59:failed
 */
