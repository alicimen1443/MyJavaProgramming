package day24_CustomMethods_Return;

import java.util.Arrays;

public class PracticeTask07_MergeMethod {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};

        int[] array3 = mergeArrays(array1,array2);
        System.out.println(Arrays.toString(array3));

    }

    public static int[] mergeArrays(int[] arr1,int[] arr2){

        int[] merge = new int[arr1.length+ arr2.length];

        int k=0;

        for (int each : arr1) {
            merge[k]=each;
            k++;
        }
        for (int each : arr2) {
            merge[k]=each;
            k++;
        }

        return merge;

    }
}

/*
7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */
