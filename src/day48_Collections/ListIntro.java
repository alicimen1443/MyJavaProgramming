package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

        // this one right here is polymorphism. List is being reference to the ArrayList
        //whatever the behavior of the List was, it also applies to the ArrayList

        //for accessing the elements, ArrayList is faster
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list1.get(0));


        //for adding or removing element, LinkedList is faster
        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list2.get(0));



        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list3.get(0));

        //Last-in, first out order(LIFO)
        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list4.get(0));

        System.out.println("---------------------------");

        System.out.println(list4);

        ((Stack<Integer>) list4).pop();

        System.out.println(list4);  //[10, 20, 30, 40, 50]

        ((Stack<Integer>) list4).pop();

        System.out.println(list4);  //[10, 20, 30, 40]


    }

    public synchronized void method1(){

    }

}
