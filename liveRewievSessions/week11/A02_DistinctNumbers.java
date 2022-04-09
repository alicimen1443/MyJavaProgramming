package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A02_DistinctNumbers {
    //it will get input from user, and only will store distinct numbers to our arrayList

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // empty arrayList for our input(Integer objects)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (input ends with 0) : ");

        int value;

        do{
            value= input.nextInt();
            if(!list.contains(value)&&value!=0){ // if arraylist doesn't contain and not equal to zero
                list.add(value);
            }

        }while(value!=0);

        for (Integer numbers : list) {
            System.out.print(numbers+" ");
        }
        System.out.println();

        System.out.println("the size of our array "+list.size());

        //i want to sort my Arraylist

        //Collections utility class comes with many useful methods

        Collections.sort(list); // to sort your arrayList : in order to be able to use sort method, your object class needs to be comparable

        System.out.println(list);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.shuffle(list); // random shuffle
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);



    }
}
