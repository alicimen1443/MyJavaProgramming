package day53_FunctionalInterface.practiceTasks;

import java.util.*;
import java.util.function.Function;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        //4.1 Create a function that can return the sum of digits from a string
      /*  Function<String, Integer> sumOfDigits = str -> str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        System.out.println("Sum of digits of \"7kjdsh8dsf9ds\" = " + sumOfDigits.apply("7kjdsh8dsf9ds"));
       */

        Function<String,Integer> sumOfDigits = s -> {
            int sum=0;

            for (char each : s.toCharArray()) {
                if(Character.isDigit(each)){
                   int a = Integer.parseInt(""+each);
                   sum+=a;
                   //sum+=Character.getNumericValue(each);
                }
            }
            return sum;
        };
        String str= "dsa435sda4";
        System.out.println(sumOfDigits.apply(str));


        //4.2 Create a function that can convert a Set of Integers to List of Integers
        Function<Set<Integer>, List<Integer>> convertSetToList = n->{
            return new ArrayList<>(n);
        };

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(convertSetToList.apply(set));

        //4.3 Create a function that can convert a Set of String to List of String
        Function<Set<String>, List<String>> convertSetToListString = s->{
            return new ArrayList<>(s);
        };
        Set<String> set1 = new LinkedHashSet<String>(Arrays.asList("Ali","Jack","Tom","Sam","Mike","Kate"));

        System.out.println(convertSetToListString.apply(set1));

        //4.4 Create a function that can return the reversed version of an int array

        Function<int[],int[]> reverseIntArray= arr->{
            int[] reversed = new int[arr.length];

            int k =0;
            for (int i = arr.length-1; i >=0; i--) {
                reversed[k++]=arr[i];
            }
            return reversed;
        };

        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(reverseIntArray.apply(arr)));

        //4.5 Create a function that can return the reversed version of a String array
        Function<String[],String[]> reverseStringArray= arr1->{
            String [] reversed = new String[arr1.length];

            int k =0;
            for (int i = arr1.length-1; i >=0; i--) {
                reversed[k++]=arr1[i];
            }
            return reversed;
        };

        String[] arr1 = {"Ali","Cem","Kate","Mike","Steve","Jack"};

        System.out.println(Arrays.toString(reverseStringArray.apply(arr1)));

        //4.6 Create a function that can return the sorted (decending) version of an int array
        //				Note: you can use the reverse function you created at 4.4

        Function<int[],int[]> descendingArray= arr2->{

            Arrays.sort(arr2);

            return reverseIntArray.apply(arr2);
        };

        int[] arr2 = {1,54,23,21,35,63,21,3,87};
        System.out.println(Arrays.toString(descendingArray.apply(arr2)));

        //4.7 Create a function that can return the sorted (decending) version of a String array
        //Note: you can use the reverse function you created at 4.5

        Function<String[],String[]> descendingStringArray= str1->{
            Arrays.sort(str1);
            return reverseStringArray.apply(str1);
        };
        String[] arr3 = {"Ali","Cem","Kate","Mike","Steve","Jack"};
        System.out.println(Arrays.toString(descendingStringArray.apply(arr3)));


    }
}
/*
4. Use Function functional interface to:
		4.1 Create a function that can return the sum of digits from a string

		4.2 Create a function that can convert a Set of Integers to List of Integers

		4.3 Create a function that can convert a Set of String to List of String

		4.4 Create a function that can return the reversed version of an int array

		4.5 Create a function that can return the reversed version of a String array

		4.6 Create a function that can return the sorted (decending) version of an int array
				Note: you can use the reverse function you created at 4.4

		4.7 Create a function that can return the sorted (decending) version of a String array
				Note: you can use the reverse function you created at 4.5
 */