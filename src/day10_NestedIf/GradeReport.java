package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90~100 :excellent
        80~89:great
        70~79:good
        60~69:passed
        0~59:failed
         */
        int score=95;
        String grade="";    //temporary

        if(score>=0 && score<=100){
            if(score>=90){
                grade="A";
            }
            else if(score>=80){
                grade="B";
            }
            else if(score>=70){
                grade="C";
            }
            else if(score>=60){
                grade="D ";
            }
            else {
                System.out.println("Failed");
            }
            System.out.println(grade);

        }else{
            System.out.println("invalid score");
        }








    }
}
