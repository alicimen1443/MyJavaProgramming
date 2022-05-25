package week19;

import java.util.*;

public class ListExamples {

    public static void main(String[] args) {

        List<String> listOne = new ArrayList<>(); //Polymorphic way

        ArrayList<String> arrayList = new ArrayList<>(); //not polymorphic way

        List<String> listTwo = new Stack<>();

        listOne.add("Mike");
        listOne.add("Oscar");
        listOne.addAll(Arrays.asList("Selena", "Cemal", "Nihal", null, null, null, "Selena", "Oscar"));

        System.out.println("listOne = " + listOne);

        listTwo.addAll(listOne);
        System.out.println("listTwo = " + listTwo);

        /*
        Stack Methods
        peek() ---> brings you the element which last LIFO : Last in First out
        pop() ----> brings you the element which last LIFO : Last in First out and DELETES the element
        push() ---> similar to add method
         */
        String str = ((Stack<String>) listTwo).peek(); //since it is created in polymorphic way I have to cast to STACK
        System.out.println("str = " + str);

        str = ((Stack<String>) listTwo).pop();
        System.out.println("str = " + str);

        System.out.println("listTwo = " + listTwo);

        ((Stack<String>) listTwo).push("Oscar");
        System.out.println("ListTwo after push method = " + listTwo);

        //Collections Utility class comes with useful methods: such as sorting
        listTwo.removeAll(null);
        Collections.sort(listTwo);
        System.out.println("listTwo after sort method = " + listTwo);

        Collections.sort(listOne);
        System.out.println("listOne = " + listOne);


        List<Integer> listThree = new Stack<>();

        listThree.addAll(Arrays.asList(45, 2, 454, 60, 80, 40, 90));
        System.out.println(listThree);

        Collections.sort(listThree);
        System.out.println("listThree after sorting = " + listThree);





    }
}
