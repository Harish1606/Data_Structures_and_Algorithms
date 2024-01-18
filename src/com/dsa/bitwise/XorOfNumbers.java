package com.dsa.bitwise;

//To find XOR of numbers from 0 to n
//0^1^2^3^.....^n
public class XorOfNumbers {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(findXor(n));
    }

    private static int findXor(int n) {
        if(n % 4 == 0){
            return n;
        }

        if(n % 4 == 1){
            return 1;
        }

        if(n % 4 == 2){
            return n + 1;
        }

        return 0;
    }
}
