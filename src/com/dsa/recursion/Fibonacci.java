package com.dsa.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    private static int fibonacci(int n) {
        if(n<2)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

}
