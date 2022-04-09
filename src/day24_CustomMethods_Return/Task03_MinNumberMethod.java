package day24_CustomMethods_Return;

public class Task03_MinNumberMethod {
    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6,7,8,9,10};
        int minimum =min(numbers);
        System.out.println(minimum);
    }
    public static int min(int[] number){

        int minNumber=number[0];

        for (int each : number) {
            if(each<minNumber){
                minNumber=each;
            }
        }
        return minNumber;
    }
}
