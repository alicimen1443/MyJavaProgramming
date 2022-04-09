package day24_CustomMethods_Return;
import java.util.Arrays;
public class PracticeTask06_AddElementMethod {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int num = 4;

        int[] newArr = addElement(arr,num);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] addElement(int[]arr,int num){

        int[] addElement=new int[arr.length+1];
        int k=0;
        for (int i = 0; i < addElement.length-1; i++) {  // for assigning elements except last one
            addElement[k]=arr[i];
            k++;
        }
        addElement[addElement.length-1]=num; // for assigning the last one
        return addElement;
    }
}





/*
 create a method named addElement that takes one integer array and one integer,
  the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */