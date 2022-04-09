package day24_CustomMethods_Return;

public class PracticeTask09_ContainsMethod {
    public static void main(String[] args) {

        int[] array ={1,2,3,4,5,6,7,8};
        int number= 10;

        boolean contains =containsMethod(array,number);

        System.out.println(contains);


    }

    public static boolean containsMethod(int[] arr,int num){

        boolean contains=false;
        for (int each : arr) {
            if(each==num){
                contains=true;
            }
        }
        return contains;

    }

}

/*
9. Create a method named contains that passes one integer array and one integer parameters,
 the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */
