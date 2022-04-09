package day24_CustomMethods_Return;

public class Task02_MaxNumberMethod {
    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6,7,8,9,10};
        int maximum =max(numbers);
        System.out.println(maximum);
    }
    public static int max(int[] number){

        int maxNumber=number[0];

        for (int each : number) {
            if(each>maxNumber){
                maxNumber=each;
            }
        }
        return maxNumber;
    }
}

/*
2. create a method that can return the maximum number from an array of integers
 */
