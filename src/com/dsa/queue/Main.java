package com.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception{
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(7);
        queue.add(14);
        queue.add(11);
        queue.add(8);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());

        System.out.println("Custom queue starts from here -----------------");

        CustomQueue customQueue = new CustomQueue();
        customQueue.insert(13);
        customQueue.insert(8);
        customQueue.insert(1);
        customQueue.insert(5);
        customQueue.insert(9);
        System.out.println(customQueue.remove());
        System.out.println(customQueue.peek());
    }
}
