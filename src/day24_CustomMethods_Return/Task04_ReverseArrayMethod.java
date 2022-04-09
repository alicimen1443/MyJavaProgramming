package day24_CustomMethods_Return;

import java.util.Arrays;

public class Task04_ReverseArrayMethod {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7};
        arr = reversedArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] reversedArray(int[] number){

        int[] reversedArray=new int[number.length];

        for (int i = number.length - 1,j=0; i >= 0; i--,j++) {

            reversedArray[j]=number[i];
        }
        return reversedArray;
    }
}

/*
	4. create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}
 */
