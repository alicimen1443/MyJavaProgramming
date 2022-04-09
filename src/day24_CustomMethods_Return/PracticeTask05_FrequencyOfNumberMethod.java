package day24_CustomMethods_Return;

public class PracticeTask05_FrequencyOfNumberMethod {
    public static void main(String[] args) {

        int [] array ={1,1,3,3,3,6,7,7,8,9,};
        int num =3;

        int frequency = frequencyOfNumber(array,num);
        System.out.println(frequency);

    }

    public static int frequencyOfNumber(int[] arr,int number){

        int frequency=0;

        for (int each : arr) {
            if(each==number){
                frequency++;
            }
        }
        return frequency;
    }
}
/*
  5. create method that accepts one integer array and
   one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */
