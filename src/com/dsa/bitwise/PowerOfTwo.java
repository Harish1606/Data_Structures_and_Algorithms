package com.dsa.bitwise;

//To find the number is power of 2
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16; // N should be greater than 0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }

}
