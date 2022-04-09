package week06;

public class BasicLoopExamples {

    public static void main(String[] args) {

        for (int i = 0; i <1001 ; i+=10) {  // i : local variable, only works inside for loop

            System.out.print(i+" ");
        }

        System.out.println("--------------------------------");
        int z = 0;
        for( ; z<=1000; ){
            System.out.print(z+" ");
            z+=10; // iteration
        }
        //if we make the initialization outside the for loop, the variable z can be used within the entire class.
        // Or when the initalization is made within the for loop as usual, then the z only belongs to the loop
        /*
        int z = 0;
          for(  ; z <= 1000 ;  ){
              if(z%10==0) {
                  System.out.print(z + " ");
              }
              z++;
         */
        System.out.println("-----------------------------------");

        for (int i = 3; i <130 ; i+=2) { // odd nums between given range

            System.out.print(i+" ");
        }

        System.out.println("---------------------------------------------------");

        //between 5-50(included) how many even numbers
        System.out.println("-------------------------------------");

        int countOfEven=0;

        for (int i = 5; i <=50 ; i++) {
            if(i%2==0){
                ++countOfEven;
            }
        }
        System.out.println("count Of Even numbers between 5 and 50 = " + countOfEven);

        System.out.println("---------------------------------");

        int j =1;
        for(  ;j<=10  ;j++ ){
            System.out.println("12 X "+j+" = "+(12*j));
        }









    }
}
/*
 * Question-1:

 Write a for loop that displays the following set of numbers:

 0,10,20,30,40,50,...1000


 */
