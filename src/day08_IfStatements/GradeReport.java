package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
/*
        System.out.println(true==!false);   //true
        System.out.println(!true != false); //false
        System.out.println(!false == true); //true
        System.out.println(!!false); //false
        System.out.println(!!!true); //false

 */
        int score = 50; // 0~100
        String result;

        boolean a = score >=90 && score <=100; //false
        boolean b = score >=80 && score <=89;  //true
        //or, boolean b = score >=80 && !a;
        boolean c = score >= 70 && score <=79; //false
        //or, boolean c = !a && !b && score >=70;
        boolean d = score >= 60 && score <=69;  //false
        //or, boolean d = !a && !b && !c && score <=69;
        boolean f = score <=59 && score <=59;  //false
        // or, boolean f = !a && !b && !c && !d;

        if(a) { // if the student made an A
           // System.out.println("Excellent");
            result = "Excellent";
        }
        else if(b) { // if the student made a B

        //System.out.println("Grate");
            result ="Grate";
            }
        else if(c){ // if the student made a C

       // System.out.println("Good");
            result = "Good";
            }
        else if(d){ // if the student made a D

        //System.out.println("Pass");
            result="Pass";

        }
        else{ // if the student made a F

        //System.out.println("Failed");
            result = "Failed";
        }
        System.out.println("result = " + result);


    }
}

/*
score:
    90~100 ==> Excellent
    80~98  ==> Grate
    70~79  ==> Good
    60~69  ==> Pass
    0~59   ==> Failed

 */
