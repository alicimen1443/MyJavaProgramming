package day24_CustomMethods_Return;

import java.util.Arrays;

public class PracticeTask08_ReverseMethod {
    public static void main(String[] args) {

        int [] arr ={10,20,30,40,50};
        int[] arrNew = reverseArray(arr);

        System.out.println(Arrays.toString(arrNew));


    }
     public static int[] reverseArray(int[] arr){

        int[] reverseArray = new int[arr.length];

         for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
             reverseArray[j]=arr[i];
         }
         return reverseArray;
     }

}

/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
 */
