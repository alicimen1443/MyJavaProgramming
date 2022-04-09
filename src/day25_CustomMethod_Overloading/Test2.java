package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("-------------------------------");

        double[] arr2 = {1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("-------------------------------");

        char[] arr3 = {'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("-------------------------------");

        String[] arr4 ={"java","python","c++"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("-------------------------------");

        int[] n1 ={10,2,3,4,5,6};
        int max1=ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        double[] n2 ={2.3,4.5,6.6,7.8,20.5};

        double max2 =ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        int[] a1 ={1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);

        System.out.println("-----------------------------");

        String[] s ={"java","programming","language"};
        String[] s1={"python","programming","language"};

        String[] result = ArraysUtility.merge(s,s1);
        System.out.println(Arrays.toString(result));

        System.out.println("-------------------------");

        int[] ar1 ={1,2,3,4,5};
        int[] ar2 = {6,7,8,9,10};
        int[] result1 =ArraysUtility.merge(ar1,ar2);
        System.out.println(Arrays.toString(result1));

        System.out.println("------------------------");

        System.out.println(Arrays.toString(ArraysUtility.reverse(ar1))); //{5,4,3,2,1}

        System.out.println("---------------------");

        System.out.println(Arrays.toString(ArraysUtility.reverse(arr4)));




    }
}
