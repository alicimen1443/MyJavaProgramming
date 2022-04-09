package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;


public class PracticeTask01_DescendingOrder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of your int Array");
        int length = scan.nextInt();

        int[] arr = new int[length];
        int[] result = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please assign numbers into the array");
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        for (int i = arr.length-1,j=0; i >=0 ; i--,j++) {
            result[j]=arr[i];
        }
        System.out.println(Arrays.toString(result));



    }}
 /*
        int[] numbers = {3,4,2,7,5,9,0};
        Arrays.sort(numbers);
        int[] descending = new int[numbers.length];
        int i = 0;
        for (int j = descending.length - 1 ; j >= 0; j--) {
            descending[i++]=numbers[j];
        }
        System.out.println(Arrays.toString(descending));





    }
}

/*
1. Write a program that sort the array of integer in descending order
 */
