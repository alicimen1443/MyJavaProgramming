package day15_ForLoops;

public class ForLoopPractices {

    public static void main(String[] args) {

        // 15 16 17 18......45

        /*
        System.out.println(15);
        System.out.println(16);
        ...
         */
        for(int i =15; i<=45; i++){ // i here is a local variable within the for block,we cannot use it outside the if block
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("--------------------------------");
        //100~50
        for(int i=100;i>=50;i--){  // ( >= , <= , > , < )
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("---------------------------------------------------");

        //print all the even numbers between 1~5

        for(int i = 1;i<=55;i++ ){

            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();

        System.out.println("--------------------------------");

        for(int i=2; i<=54; i+=2){
            System.out.print(i+" ");
        }










    }
}
