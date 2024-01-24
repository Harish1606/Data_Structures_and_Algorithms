package com.dsa.recursion.common;

//Uses linear recurrence
public class SequenceOfNumbers {
    public static void main(String[] args) {
        sequence1(5);
        sequence2(5);
    }

    private static void sequence1(int n) {
        if(n==0)
            return;
        sequence1(n-1);
        System.out.println(n);
    }

    private static void sequence2(int n) {
        if(n==0)
            return;
        System.out.println(n);
        sequence2(n-1);
    }


}
