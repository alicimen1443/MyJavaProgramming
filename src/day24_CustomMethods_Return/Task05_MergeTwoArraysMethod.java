package day24_CustomMethods_Return;

import java.util.Arrays;

public class Task05_MergeTwoArraysMethod {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] merge =mergeTwoArrays(arr1,arr2);
        System.out.println(Arrays.toString(merge));
    }
    public static int[] mergeTwoArrays(int[] arr1,int[] arr2){
        int [] mergeArrays = new int[arr1.length + arr2.length];
        int k =0;
        for (int each1 : arr1) {
            mergeArrays[k]=each1;
            k++;
        }
        for (int each2 : arr2) {
            mergeArrays[k]=each2;
            k++;
        }
        return  mergeArrays;
    }
}

/*
5. create a method that can merge two arrays and return the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}

 */