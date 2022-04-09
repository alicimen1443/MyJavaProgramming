package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int number = 100;

        if(number%2==0){
            System.out.println("Even");  //String
        }else{
            System.out.println("Odd");   //String
        }

        System.out.println("------------------------------------");

        String result1 = (number%2==0)? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("---------------------------------------");

        int age = 23;
        /*
        if(age>=21){
            System.out.println("eligible");          //String
        }else{
            System.out.println("not eligible");     //String
        }*/

        //System.out.println((age>=21) ? "eligible" : "not eligible");
        String result2 =(age>=21) ? "eligible" : "not eligible";
        System.out.println(result2);

        System.out.println("--------------------------------------------");

        int n =100;
        /*if(n>0){
            System.out.println("positive");
        }
        else if(n<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }*/

       String result3 = (n>0) ? "positive" :(n<0)? "negative" : "zero";
        System.out.println(result3);





    }
}
