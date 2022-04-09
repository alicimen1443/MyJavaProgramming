package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,0};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]<min){ // if there is element in the array that is smaller than the current minimum number
                min=numbers[i]; // assigning minimum number to variable min

            }
        }

        System.out.println(min);


    }
}
