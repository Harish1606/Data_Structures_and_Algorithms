package com.dsa.bitwise;

//Set ith bit to 1 in the given number
public class SetIthBitToOne {
    public static void main(String[] args) {
        int n = 20;
        int i = 4;
        System.out.println(setIthBitToOne(n, i));
    }

    private static int setIthBitToOne(int n, int i) {
        return n | (1<<(i-1));
    }

}
