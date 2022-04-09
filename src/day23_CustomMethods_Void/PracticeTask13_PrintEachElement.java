package day23_CustomMethods_Void;

public class PracticeTask13_PrintEachElement {
    public static void main(String[] args) {

        printEachElement(new int[]{1,2,3,4,5,6});



    }
    public static void printEachElement(int[] numbers){

        for (int each : numbers) {
            System.out.print(each+" ");

        }

        }
    }

/*

	14. create a method named printEachElement that can print each elements of an integer array

 */
