package day23_CustomMethods_Void;

public class PracticeTask05_Grade {
    public static void main(String[] args) {

        grade(89);

    }

    public static void grade (int score){
        String grade=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=50)?"D":"F";
        System.out.println(grade);
    }
}

/*
5. create a method that can calculate the grade of the student based on the score
 */
