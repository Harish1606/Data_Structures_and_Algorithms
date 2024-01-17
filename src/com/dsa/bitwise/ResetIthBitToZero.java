package com.dsa.bitwise;

//Reset ith bit to 0 in the given number
public class ResetIthBitToZero {
    public static void main(String[] args) {
        int n = 20;
        int i = 3;
        System.out.println(resetIthBitToZero(n, i));
    }

    private static int resetIthBitToZero(int n, int i) {
        return n & (~(1 << (i-1)));
    }
}
