package day22_MultiDimensionalArray;

import java.util.Arrays;

public class PracticeTask1Return_New {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},{4, 5, 6},{7,8,9},{10,11,12}};
        int[][] reverse=new int[arr.length][];

        for (int i = arr.length-1,k=0;i>=0;i--,k++) { // i : index number of arrays

            reverse[k]=new int[arr[i].length];

            for (int j =arr[i].length-1,l=0;j>=0;j--,l++) { // i : index number of elements

                reverse[k][l]=arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(reverse));



    }
}

/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1} };
 */
