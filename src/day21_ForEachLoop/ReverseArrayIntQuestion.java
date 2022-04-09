package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArrayIntQuestion {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40};
        //                0  1  2  3

        int [] reversed = new int[numbers.length]; // {50,4,30,20,10} make sure that the array has the enaugh capacity to contain all the elements
        /*     j             i
        numbers[0] = numbers[3];
        numbers[1] = numbers[2];
        numbers[2] = numbers[1];
        numbers[3] = numbers[0];
           // we get reversed array {40,30,20,10}
           
         */
        for (int i = numbers.length-1,j=0; i >=0; i--,j++) {
            reversed[j]=numbers[i];

            }

        System.out.println(Arrays.toString(reversed));

    }
}
