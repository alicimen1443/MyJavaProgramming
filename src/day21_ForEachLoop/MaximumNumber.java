package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,0};
        int max = numbers[0];
      /*
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>max){ // if there is an element in the array that is greater than the current max number
                max=numbers[i]; // assigning greater number to variable max

            }
        }
       */
        for (int each : numbers) {
            if(each>max){
            max=each;
            }
        }
        System.out.println("Maximum number is: " +max);


    }
}
