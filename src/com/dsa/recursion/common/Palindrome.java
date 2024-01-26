package com.dsa.recursion.common;

public class Palindrome {
    public static void main(String[] args) {
        int n = 10301;
        System.out.println(palindrome(n));
    }

    private static boolean palindrome(int n) {
        return n == rev(n);
    }

    private static int rev(int n) {
        if(n%10==n){
            return n;
        }
        int d = (int) Math.log10(n);
        int r = (n%10) * (int) (Math.pow(10, d));
        return r + rev(n/10);
    }
}
