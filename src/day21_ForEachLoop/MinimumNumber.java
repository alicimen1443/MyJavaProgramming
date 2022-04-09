package day21_ForEachLoop;

public class MinimumNumber {
    public static void main(String[] args) {


        int[] numbers = {10,5,4,20,0};
        int min = numbers[0];



        for (int number : numbers) {
            if(number<min){
                min=number;
            }

        }

        System.out.println(min);



    }
}
