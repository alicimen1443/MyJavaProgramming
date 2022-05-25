package day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue); //[10, 40, 300, 200, 90]

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDeque = " + arrayDeque); //arrayDeque = [10, 200, 300, 40, 90] keeps the order

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList); //linkedList = [10, 200, 300, 40, 90] keeps the order

        System.out.println("-------------------------------------------------------------------");

        priorityQueue.poll(); //special method of queue : first in - first out

        System.out.println("priorityQueue = " + priorityQueue);//priorityQueue = [40, 90, 300, 200]

        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue);//priorityQueue = [90, 200, 300]

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque); //arrayDeque = [200, 300, 40, 90]

        linkedList.poll();

        System.out.println("linkedList = " + linkedList); //linkedList = [200, 300, 40, 90]

        System.out.println("---------------------------------------------");

        //System.out.println(priorityQueue.get(1)); compiling
        //System.out.println(arrayDeque.get(1)); compiling

        System.out.println(  ((List)linkedList).get(1)  );






    }
}
