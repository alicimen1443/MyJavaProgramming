package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class PracticeTask01_Insert {
    public static void main(String[] args) {
        int [] arr={10, 20, 30, 40, 50};

       arr= insert(arr,2,100);
        System.out.println(Arrays.toString(arr));

    }
    // inserts the element at the given index,returns new array
    public static int[] insert(int[] array,int index,int element){

        int[] arr =new int[array.length+1]; //arr = {10, 20, 30, 40, 50}  ==> {10, 20, 100, 30, 40, 50}


      /* for (int i = 0; i < index; i++) {
            newInsert[i]=array[i];
        }
        newInsert[index]=element;

        for (int j = index+1, k=index; j < newInsert.length; j++,k++) {

            newInsert[j]=array[k];
        }

       */
        for (int i = 0; i < arr.length; i++) {
            if(i<index)
                arr[i]=array[i];
            else if(i==index)
                arr[i]=element;
            else
                arr[i]=array[i-1];

        }
        return arr;

}

    // inserts the element at the given index,returns new array
    public static double[] insert(double[] array,int index,double element){

        double[] arr =new double[array.length+1];


      /* for (int i = 0; i < index; i++) {
            newInsert[i]=array[i];
        }
        newInsert[index]=element;

        for (int j = index+1, k=index; j < newInsert.length; j++,k++) {

            newInsert[j]=array[k];
        }

       */
        for (int i = 0; i < arr.length; i++) {
            if(i<index)
                arr[i]=array[i];
            else if(i==index)
                arr[i]=element;
            else
                arr[i]=array[i-1];

        }
        return arr;


    }

    // inserts the element at the given index,returns new array
    public static char[] insert(char[] array,int index,char element){

        char[] arr =new char[array.length+1];


      /* for (int i = 0; i < index; i++) {
            newInsert[i]=array[i];
        }
        newInsert[index]=element;

        for (int j = index+1, k=index; j < newInsert.length; j++,k++) {

            newInsert[j]=array[k];
        }

       */
        for (int i = 0; i < arr.length; i++) {
            if(i<index)
                arr[i]=array[i];
            else if(i==index)
                arr[i]=element;
            else
                arr[i]=array[i-1];

        }
        return arr;


    }

    // inserts the element at the given index,returns new array
    public static String[] insert(String[] array,int index,String element){

        String[] arr =new String[array.length+1];


      /* for (int i = 0; i < index; i++) {
            newInsert[i]=array[i];
        }
        newInsert[index]=element;

        for (int j = index+1, k=index; j < newInsert.length; j++,k++) {

            newInsert[j]=array[k];
        }

       */
        for (int i = 0; i < arr.length; i++) {
            if(i<index)
                arr[i]=array[i];
            else if(i==index)
                arr[i]=element;
            else
                arr[i]=array[i-1];

        }
        return arr;


    }





        }


/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
		 the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */