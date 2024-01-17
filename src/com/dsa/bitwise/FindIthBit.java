package com.dsa.bitwise;

//Find i th bit for the given number
public class FindIthBit {
    public static void main(String[] args) {
        int n = 20;
        int i = 3;
        System.out.println(findIthBit(n,i));
    }

    private static int findIthBit(int n, int i) {
        return (n & (1 << (i-1))) == 0 ? 0 : 1;
    }
}
