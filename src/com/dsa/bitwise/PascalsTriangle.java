package com.dsa.bitwise;

//1
//11
//121
//1331
//14641
//Each row sum is power of 2
//To find the sum of nth row
//(1 << (n-1)) = (1 * (2 power (n-1)))
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(1 << (n-1));
    }
}
