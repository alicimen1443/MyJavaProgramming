package day20_Arrays;

import java.util.Arrays;

public class PracticeTask05_ReverseAnArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int[] reversedNumbers = new int[numbers.length];


        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reversedNumbers[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reversedNumbers));

        }
    }

/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */