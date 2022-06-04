package day53_FunctionalInterface.practiceTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayFunctionTest {
    public static void main(String[] args) {

        // 2.1 Create a function that can return the maximum number from an array of Integers
        ArrayFunction<Integer, Integer> findTheMax = (arr) -> {

           return Collections.max(Arrays.stream(arr).collect(Collectors.toList()));
           //the second way, we can create a list
           // List<Integer> list = new ArrayList<>(Arrays.asList(arr));
            //return Collections.max(list);

        };
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(findTheMax.apply(arr));

        //1.2 Create a function that can return the minimum number from an array of Integers
        ArrayFunction<Integer, Integer> findTheMin = (arr1) -> {

            return Collections.min(Arrays.stream(arr).collect(Collectors.toList()));
            //the second way, we can create a list
            // List<Integer> list = new ArrayList<>(Arrays.asList(arr));
            //return Collections.max(list);
        };
        System.out.println(findTheMin.apply(arr));

        //1.3 Create a function that can return the longest String from an array of String

        ArrayFunction<String,String> findTheLongest = (arr2)->{
            String max = "";
            for (String each : arr2) {
                if(each.length()>max.length()){
                    max=each;
                }
            }
            return max;
        };

        String[] arr2 = {"Java","Python","Ruby","C++","C#"};
        System.out.println(findTheLongest.apply(arr2));

        //1.4 Create a function that can return the shortest String from an array of String
        ArrayFunction<String,String> findTheShortest = (arr3)->{
            String min = "";
            for (String each : arr2) {
                if(each.length()<min.length()){
                    min=each;
                }
            }
            return min;
        };
        System.out.println(findTheShortest.apply(arr2));


    }
}
/*
        2.1 Create a function that can return the maximum number from an array of Integers

		1.2 Create a function that can return the minimum number from an array of Integers

		1.3 Create a function that can return the longest String from an array of String

		1.4 Create a function that can return the shortest String from an array of String
 */