package day53_FunctionalInterface;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {

        // Predicate method returns boolean
        Predicate<String> isPalindrome = (p)->{
            String reverse= new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1= isPalindrome.test("Java");
        System.out.println(result1);

        Predicate<Integer> isEven = p-> p%2==0;

        System.out.println("-----------------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,1,2,3));
        list.removeIf(isEven);

        System.out.println(list);

        System.out.println("-----------------------------------------------");

        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Level","Anna","Java","Python"));

        names.removeIf(isPalindrome);

        System.out.println(names);

        System.out.println("-------------------------------------");

        //You can always use this consumer functional interface if you ever have to create a function
        //that takes one type of any object and does not return any value
        Consumer<String> printEach = (s)->{
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("----------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,34,5,6,7,8,9));

       /*
       for (Integer each : list2) {
            if(each%2!=0){
                System.out.println(each);
            }
        }
        */
        //exactly the same of above code fragment
        list2.forEach(p-> {if(p%2!=0) System.out.println(p);});

        System.out.println("-----------------------------------------------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(s-> System.out.println(s.charAt(0)+"."+s.charAt(s.lastIndexOf(" ")+1)));

        System.out.println("-----------------------------------------------------------------");

        Function<int[],List<Integer>> convertToList = (a)->{
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);

        System.out.println("-------------------------------------------------------------");

        Function<List<Integer>,int[]> convertToArray = (a)->{
            int[] result = new int[a.size()];

            for (int i = 0; i < a.size(); i++) {
               result[i]+= a.get(i);
            }
            return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int[] result2 =  convertToArray.apply(numbers);

        System.out.println(Arrays.toString(result2));

        System.out.println("---------------------------------------");

        // create a function that can return the maximum number from an int array
        Function<int[],Integer> maxNumberOfArray = (a)->{

            int max=Integer.MIN_VALUE;

            for (int each : a) {
                if(each>max){
                    max=each;
                }
            }
            return max;
        };
        int[] arr1 ={1,2,3,4,5,6,7,8,9,10};

        int max= maxNumberOfArray.apply(arr1);
        System.out.println(max);

        // create a function that can swap the first and last elements of an array
        Function<int[],int[] > swapFirstAndLastElements = (a)->{
            int temp = a[a.length-1];
            a[a.length-1]=a[0];
            a[0]=temp;

            return a;
        };

        int[] array = {27, 28, 30, 32, 35, 40, 45, 52};
        array = swapFirstAndLastElements.apply(array);
        System.out.println(Arrays.toString(array));


        // Create a function that can reverse an array and returns it
        Function<String[],String[] > reverseArray = (n)->{
            String[] ar = new String[n.length];
            int k =0;
            for (int i = n.length-1; i >=0; i--) {
                ar[k++]=n[i];
            }
            return ar;
        };

        String[] ar = {"a","b","c","d","e","f"};
        ar=reverseArray.apply(ar);
        System.out.println(Arrays.toString(ar));

        // create a function that can reverse a List

        Function<List<Integer>,List<Integer> > reverseList = (n)->{
            List<Integer> list1 = new ArrayList<>();

            for (int i = n.size()-1; i >=0; i--) {
                list1.add(n.get(i));
            }
            return list1;
        };
        List<Integer> list3=new ArrayList<>(Arrays.asList(10,12,14,16,18,20));

        list3=reverseList.apply(list3);
        System.out.println(list3);















    }
}
