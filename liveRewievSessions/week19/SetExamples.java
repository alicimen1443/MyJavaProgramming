package week19;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {

        //Does Not allow duplicates: helps you to Implement some coding algorithms

        String str = "aaaabbccccddddeeee";

        List<String> listOne = new ArrayList<>();
        listOne.addAll(Arrays.asList(str.split("")));
        System.out.println("listOne = " + listOne);

        Set<String> linkedHashSet = new LinkedHashSet<>(); // to keep my Insertion order
        linkedHashSet.addAll(listOne); // What happens at this line, duplicates are removed
        System.out.println("stringSet = " + linkedHashSet);
        linkedHashSet.add(null);
        System.out.println("stringSet after adding null= " + linkedHashSet);

        Set<String> hashSet = new HashSet<>();// if we don't need nay kind of order we can go ahead with HashSet, we can put one null value
        hashSet.addAll(listOne);
        System.out.println("stringSet1 = " + hashSet);
        hashSet.add("g");
        hashSet.add(null);
        System.out.println("stringSet1 = " + hashSet);

        Set<String> treeSet = new TreeSet<>();

        treeSet.addAll(listOne);
        //treeSet.add(null);
        System.out.println("treeSet = " + treeSet);
    }
}
