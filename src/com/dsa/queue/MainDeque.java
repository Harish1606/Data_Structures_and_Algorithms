package com.dsa.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(5);
        deque.addFirst(2);
        deque.removeFirst();
        System.out.println(deque);
    }
}
