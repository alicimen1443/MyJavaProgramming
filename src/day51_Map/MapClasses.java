package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //   key    value    --> only the key has to be unique
        Map<Integer,String> hashMap = new HashMap<>();// this hashmap, the  performance is fastest compared to the other classes
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Ahmet");
        hashMap.put(5,"Isabella");
        hashMap.put(6,null);
        hashMap.put(7,null);
        hashMap.put(8,null);
        hashMap.put(null,"cihad");
        hashMap.put(null,"emre");
        hashMap.put(null,"hulya");

        //null is the default value, not only for String, for any non-primitive.
        //default value for wrapper class is still null
        //as long as it is non-primitive, the default value will always be null

        System.out.println("hashMap = " + hashMap);

        System.out.println(hashMap.get(10));

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(null,"Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer,String> treeMap = new TreeMap<>(); // doesn't accept null as a key.value can be null and duplicated
        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(43,null);

        System.out.println("treeMap = " + treeMap);

        Map<Integer,String> hashtable = new Hashtable<>(); //hashtable is synchronized, doesn't accept null value as a key or value
        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Ahmet");
        hashtable.put(5,"Isabella");


        System.out.println("hashtable = " + hashtable);




    }
}
