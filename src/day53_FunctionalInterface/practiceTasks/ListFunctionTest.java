package day53_FunctionalInterface.practiceTasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFunctionTest {
    public static void main(String[] args) {

        //1.1 Create a function that can return the maximum number from a List of Integer

        ListFunction<Integer,Integer> findTheMax=(list)->{
            return Collections.max(list);
        };
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));

        System.out.println(findTheMax.apply(list));

        //1.2 Create a function that can return the minimum number from a list of Integer
        ListFunction<Integer,Integer> findTheMin=(list1)->{
            return Collections.min(list1);
        };
        System.out.println(findTheMin.apply(list));

        //1.3 Create a function that can return the longest String from a List of String
        ListFunction<String,String> longestString = (list1)->{

            String longest="";
            for (String each : list1) {
                if(each.length()>longest.length()){
                    longest=each;
                }
            }
            return longest;
        };
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        String findTheLongestString = longestString.apply(days);
        System.out.println(findTheLongestString);

        //1.4 Create a function that can return the shortest String from a List of String
        ListFunction<String,String> shortestString = (list2)->{

            String shortest= list2.get(0);
            for (String each : list2) {
                if(each.length()<shortest.length()){
                    shortest=each;
                }
            }
            return shortest;
        };
        String findTheShortestString = shortestString.apply(days);
        System.out.println(findTheShortestString);

        //1.5 Create a function that can convert List of integer to int array
        ListFunction<Integer,int[]> convertListToIntArray=(integerList)->{
            int[] arr = new int[integerList.size()];
            for (int i = 0; i < integerList.size(); i++) {
                arr[i]= integerList.get(i);
            }
            return arr;

        };

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(Arrays.toString(convertListToIntArray.apply(list5)));

        //1.6 Create a function that can convert List of double to double array

        ListFunction<Double,double[]> convertListToDoubleArray=(integerList)->{
            double[] arr = new double[integerList.size()];
            for (int i = 0; i < integerList.size(); i++) {
                arr[i]= integerList.get(i);
            }
            return arr;
        };
        List<Double> list3 = new ArrayList<>(Arrays.asList(1.3, 2.78, 30.8, 14.9, 5.0, 66.8, 7.0, 8.9, 99.0, 100.9));

        System.out.println(Arrays.toString(convertListToDoubleArray.apply(list3)));





    }
}
/*
Use ListFunction functional interface to:
		1.1 Create a function that can return the maximum number from a List of Integer

		1.2 Create a function that can return the minimum number from a list of Integer

		1.3 Create a function that can return the longest String from a List of String

		1.4 Create a function that can return the shortest String from a List of String

		1.5 Create a function that can convert List of integer to int array

		1.6 Create a function that can convert List of double to double array

 */
