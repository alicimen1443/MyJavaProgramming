package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 9;
        String str ="";

        if(number>=1 && number<=18){
            if(number<=5){
                str="Elementary school";
            }
            else if(number<=8){
                str="Middle school";
            }
            else if(number<=12){
                str="High school";
            }
            else if(number<=16){
                str="College";
            }else{
                str="Grand school";
            }
        }else{
            str ="Invalid grade level given";

        }
        System.out.println(str);

        System.out.println("--------------------------------------");

        String str1 = (number>=1 && number<=18)? (number<=5)? "Elementary school" : (number<=12)? "High school" :
                (number<=16)? "College" : "Grand school" : "Invalid grade level given";

        System.out.println(str1);
    }
}

/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
