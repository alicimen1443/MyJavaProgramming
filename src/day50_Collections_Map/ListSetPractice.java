package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

       // Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);

        List<String> names = null; // null means no object has been created

       // System.out.println(names.size()); // we get NullPointerException

        System.out.println("--------------------------------------------------------");

        //pop()-->LIFO  It can only be call through the Stack object

        List<Character> chars = new Stack<>();

        chars.addAll(Arrays.asList('A','B','C','D'));

        System.out.println("chars = " + chars);  // [A,B,C,D]

        ((Stack) chars).pop(); //Since reference type is List, we need to do down casting in order to call the methods of the Stack

        System.out.println("chars = " + chars); // [A,B,C]

        //poll() ---> FIFO. this method can only be called through PriorityQueue,ArrayDeque and LinkedList

        List<String> names1 = new LinkedList<>();
        names1.addAll(Arrays.asList("James","Jimmy","Kathy","Breanna","Max"));

        System.out.println(names1);

        ((LinkedList)names1).poll();

        System.out.println(names1);

        ((LinkedList)names1).poll();

        System.out.println(names1);

    }
}
