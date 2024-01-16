package com.dsa.recursion.common;

//Uses linear recurrence
public class SequenceOfNumbers {
    public static void main(String[] args) {
        sequence(5);
    }

    private static void sequence(int n) {
        if(n==0)
            return;
        sequence(n-1);
        System.out.println(n);
    }
}
