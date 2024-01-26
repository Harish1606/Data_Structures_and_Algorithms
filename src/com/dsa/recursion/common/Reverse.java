package com.dsa.recursion.common;

public class Reverse {
    private static int rev = 0;
    public static void main(String[] args) {
        int n = 16874;
        System.out.println(rev1(n));
        System.out.println(rev2(n));
        System.out.println(rev3(n));
    }

    private static int rev1(int n) {
        if(n==0){
            return rev;
        }
        rev = (rev*10) + (n%10);
        return rev1(n/10);
    }

    private static int rev2(int n){
        int c = (int) Math.log10(n);
        return helper(n, c);
    }

    private static int helper(int n, int c) {
        if(n%10==n){
            return n;
        }
        return (n%10) * (int) (Math.pow(10, c)) + helper(n/10, c-1);
    }

    private static int rev3(int n) {
        if(n%10==n){
            return n;
        }
        int d = (int) Math.log10(n);
        int r = (n%10) * (int) (Math.pow(10, d));
        return r + rev3(n/10);
    }

}
