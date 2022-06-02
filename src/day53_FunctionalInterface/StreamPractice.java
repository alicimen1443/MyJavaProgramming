package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list=list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1=Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

        System.out.println("--------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2=list2.stream().skip(5).collect(Collectors.toList());

        System.out.println(list2);

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        nums2=Arrays.stream(nums2).skip(4).toArray();

        System.out.println(Arrays.toString(nums2));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3=list3.stream().limit(7).collect(Collectors.toList());

        System.out.println(list3);

        System.out.println("-----------------------------------------------------");
        //The stream method, it cannot modify your data structure.Stream, it just gets the input from those data
        //structure.Whatever methods that you call, it happens within the stream. If you want to return those data from
        //the stream as a new data structure as a collection the you can call the collect method. If you want to return them
        //as array then we will call toArray method. Stream is like a temporary data container not a data structure


        // the map method, you can use it whenever you need to make change to the data ,to the element within the stream
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map(p->p*10).collect(Collectors.toList());

        System.out.println(list4);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days = days.stream().map(p->p.substring(0,3)).collect(Collectors.toList());

        System.out.println(days);

        //filter() method filters out the expected ones

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        List<Integer> evens =list5.stream().filter(p->p%2==0).collect(Collectors.toList());

        System.out.println(evens);

        //count method counts that how many element we have returns long value

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));

        long countOfJava=names.stream().filter(p->p.equalsIgnoreCase("java")).count();

        System.out.println(countOfJava);

        //forEach() method is similar to forEach loop
        names.stream().filter(p->p.equalsIgnoreCase("java")).forEach(p-> System.out.println(p));


        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //allMatch() method what it does is, it takes one condition and checks all the elements matching with that condition
        // anyMatch() method, it checks the condition with the elements if there is any matching
        //nonMatch() method, if i want to verify that if the Array or Collection does not contain the specific elements that are matching with specific condition

        boolean r1 = list6.stream().allMatch(p->p%2==0);
        boolean r2 = list6.stream().anyMatch(p->p>20);
        boolean r3 = list6.stream().noneMatch(p->p%3==0);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);





    }
}
