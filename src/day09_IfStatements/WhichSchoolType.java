package day09_IfStatements;

public class WhichSchoolType {
    public static void main(String[] args) {
        int number = 18;
        String school;
        if(number<=5){
            school="Elementary school";
        }
        else if(number>5 && number<=8){
            school ="Middle school";
        }
        else if(number>8 && number<=12){
            school = "High school";
        }
        else if(number>12 && number<=16){
            school= "College";
        }else{
            school = "Grand school";
        }
        System.out.println("school = " + school);
    }
}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */