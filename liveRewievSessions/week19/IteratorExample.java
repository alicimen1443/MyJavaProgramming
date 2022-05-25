package week19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<Integer> nums = new LinkedList<>();
        nums.addAll(Arrays.asList(34, 67, 33, 12, 11, 65, 100));
        Iterator<Integer> it = nums.iterator();

        //   System.out.println("it.next() = " + it.next());
        //   System.out.println("it.next() = " + it.next());
        //  System.out.println("it.next() = " + it.next());
        //   System.out.println("it.next() = " + it.next());
        //   System.out.println("it.next() = " + it.next());
        //   System.out.println("it.next() = " + it.next());
        //   System.out.println("it.next() = " + it.next());

        while(it.hasNext()){
            System.out.println("it.next() = " + it.next());
           // it.remove();  to remove each element

        }
        System.out.println("nums = " + nums);
        //Iterator is another way of looping Inside your collection

        List<Integer> nums2 = new LinkedList<>();
        nums2.addAll(Arrays.asList(34, 67, 33, 12, 11, 65, 100));

        for (Integer each : nums2) {

        }



    }
}
