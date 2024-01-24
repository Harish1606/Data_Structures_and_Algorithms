package com.dsa.recursion.common;

public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = productOfDigits(1342);
        System.out.println(ans);
    }

    private static int productOfDigits(int n) {
        if(n==0){
            return 1;
        }
        return (n%10) * productOfDigits(n/10);
    }
}
