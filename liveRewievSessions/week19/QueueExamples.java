package week19;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<String> cities = new ArrayDeque<>();

        cities.add("Ankara");
        cities.addAll(Arrays.asList("New York","Athens","Washington","Brussels","Paris"));

        //These data structures works as FIFO : First in First out

        for (int i = 0; i < cities.size();) {
            //FIFO
            System.out.println(cities.poll()); //brings the head of the list and deletes
           // System.out.println(cities.peek()); //brings the head and doesn't delete
        }

        System.out.println("cities = " + cities.size()); // size will be 0

        for (int i = 0; i < cities.size(); i++) {
            //FIFO


        }


    }
}
