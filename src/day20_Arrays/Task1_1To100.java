package day20_Arrays;

import java.util.Arrays;

public class Task1_1To100 {

    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0,j=1; i <100 ; i++,j++) {
           numbers[i]=j;
        }
        System.out.println(Arrays.toString(numbers));



        System.out.println("------------------------------------------");

        int[] numbers1 = new int[100];

        for (int i = 0,j=100; i <100 ; i++,j--) {
            numbers1[i]=j;
        }
        System.out.println(Arrays.toString(numbers1));






    }
}

//1. create an array that has the numbers 1 to 100
