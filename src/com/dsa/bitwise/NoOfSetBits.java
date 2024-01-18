package com.dsa.bitwise;

//To find number of ones in the binary representation of n
public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 31;

        System.out.println(Integer.toBinaryString(n));

        int count=0;

        while (n > 0) {
            n = (n & (n-1));
            count++;
        }

        System.out.println(count);
    }
}
