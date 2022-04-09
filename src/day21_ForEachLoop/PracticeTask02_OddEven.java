package day21_ForEachLoop;

public class PracticeTask02_OddEven {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,13,15,17,19};

        int countEven =0;
        int countOdd =0;

        for (int each : arr) {
            if(each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);




    }
}

/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */
