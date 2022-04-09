package day24_CustomMethods_Return;

import java.util.Arrays;

public class PracticeTask10_RemoveElementMethod {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int index =2;
        int[] array2 = removeElementMethod(array,index);

        System.out.println(Arrays.toString(array2));

    }

    public static int[] removeElementMethod(int[]arr,int index){

        int[] newArray = new int[arr.length-1];


        for (int i = 0,j=0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            newArray[j++]=arr[i];
        }
        return newArray;
    }
}
/*
10. create a method named removeElement that passes one integer array and one integer,
 the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */
