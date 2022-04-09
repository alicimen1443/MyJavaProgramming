package day29_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8)); // removes all the matching ones
        System.out.println(list); //[1, 2, 4, 6, 7, 9, 10]

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,100,200,300,800,900));// this addAll method is one of the bulk operation.All the bulk operations
        // accept collection type as the argument.Their argument must be a collection type everytime when we call the bulk operations

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);

        System.out.println("------------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master","BA","BA"));

        jobTitles.retainAll( Arrays.asList("QA","SDET") );

        System.out.println(jobTitles);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2)&& nums.contains(5)&&nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10,1000));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("----------------------------------------------");

        String [] names = {"Josh","Jack","Daniel","Shay","Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names)); // one way of converting Array to List

       /* namesList.addAll(Arrays.asList(names));

        */ // second way
        System.out.println(namesList);

        System.out.println("----------------------------------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10}; // if my array is primitive type i cannot convert it to a collection type by using asList method

       // ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); //gives compiler error
// This asList method you should only use it when the array that you have is non-primitive
        Integer [] arr1 ={1,2,3,4,5,6,7,8,9,10};// if it is an integer array then we can directly add that non primitive array into the array list

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(list2);

        System.out.println("------------------------------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArraytoArrayList(arr2));

        System.out.println("list3 = " + list3);


    }

    public static ArrayList<Integer> convertArraytoArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }



}
