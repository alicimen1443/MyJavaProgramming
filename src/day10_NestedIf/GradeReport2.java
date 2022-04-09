package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

         /*
        90~100 :excellent
        80~89:great
        70~79:good
        60~69:passed
        0~59:failed
         */
        int s=95;
        String grade="";    //temporary

        if(s>=0 && s<=100){
            if(s>=90){
                grade="A";
            }
            else if(s>=80){
                grade="B";
            }
            else if(s>=70){
                grade="C";
            }
            else if(s>=60){
                grade="D ";
            }
            else {
                System.out.println("Failed");
            }
            System.out.println(grade);

        }else{
            System.out.println("invalid s");
        }

        System.out.println("-------------------------------------------");
        //solution2: use ternaries ONLY

      String grd=  (s>=0 && s<=100)? (s>=90)?"A" :(s>=80)?"B":(s>=70)?"C":(s>=60)?"D":"Failed" : "Invalid Score";
        System.out.println(grd);

        System.out.println("-----------------------------------------------------------------------------");
            //solution 3: mixing ternary and if statement
        String grade1="";

        if(s>=0 && s<=100){

            grade1 = (s >= 90) ? "A" : (s >= 80) ? "B" : (s >= 70) ? "C" : (s >= 60) ? "D" : "Failed";

        }else{
            System.out.println("invalid s");
        }
        System.out.println(grade1);



        }

    }

