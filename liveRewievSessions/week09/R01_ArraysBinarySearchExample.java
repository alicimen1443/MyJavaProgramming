package week09;

import java.util.Arrays;

public class R01_ArraysBinarySearchExample {
    public static void main(String[] args) {

        int [] nums = {-5,23,123,654,234,12345,144210}; //25 : 0,1,2  -(2+1)=-3, 700: 0,1,2,3,4 -(4+1)=-5

        int indexOne=Arrays.binarySearch(nums,23); // this statement returns index of 23

        System.out.println("indexOne = " + indexOne);

        System.out.println(Arrays.binarySearch(nums,2344));  //4

        System.out.println(Arrays.binarySearch(nums,25));  // -3
        System.out.println(Arrays.binarySearch(nums,700));  //-5

        if(Arrays.binarySearch(nums,12345)>=0){

            System.out.println("exist");
        }else{
            System.out.println("non exist");
        }

        int[] numsTwo = {56,3,-67,100,1000,75};

        Arrays.sort(numsTwo); // in order to use binarySearch method, it needs to be sorted first

        System.out.println(Arrays.binarySearch(numsTwo, 100));

        System.out.println(Arrays.binarySearch(numsTwo, 60));


        }
    }

