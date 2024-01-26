package com.dsa.recursion.common;

public class CountZeros {
    public static void main(String[] args) {
        int n = 1050060002;
        System.out.println(count(n));
    }

    private static int count(int n) {
        if(n==0){
            return 0;
        }
        return ((n%10)==0 ? 1 : 0) + count(n/10);
    }
}
