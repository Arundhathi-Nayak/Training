package org.example.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("Shreyas");
        queue.add("Akash");
        queue.add("Eeskha");
        System.out.println("Head of queue: "+queue.peek());
        queue.forEach(System.out::println);
        System.out.println("Removing element from queue: "+queue.poll());
        queue.forEach(System.out::println);
    }
}
