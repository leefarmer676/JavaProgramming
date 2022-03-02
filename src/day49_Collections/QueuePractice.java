package day49_Collections;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue);

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);

        System.out.println("------------------------");

        priorityQueue.poll(); //first element of the queue will be removed

        System.out.println("priorityQueue = " + priorityQueue); //10 was removed

        priorityQueue.poll(); //now 40 will be removed (the next element from original order)

        System.out.println("priorityQueue = " + priorityQueue);

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque);

        linkedList.poll();

        System.out.println("linkedList = " + linkedList);

        System.out.println("--------------------");

        //System.out.println(priorityQueue.get(1));
        //System.out.println(arrayDeque.get(2));

        //linkedList.get(2); doesnt work bc you can only call what the reference type has
        //need to do downcasting

        System.out.println (( (List) linkedList).get(1) );
    }
}
