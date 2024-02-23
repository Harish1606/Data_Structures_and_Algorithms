package com.dsa.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws StackException{
        Stack<Integer> stack = new Stack<>();
        stack.push(13);
        stack.push(4);
        stack.push(7);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        System.out.println("Custom stack starts from here ----------------");

        CustomStack customStack = new DynamicStack(5);
        customStack.push(5);
        customStack.push(7);
        customStack.push(3);
        customStack.push(17);
        customStack.push(13);
        customStack.push(19);

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.peek());
    }
}
