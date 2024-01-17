package com.dsa.bitwise;

//Find the number is odd or even
public class OddOrEven {
    public static void main(String[] args) {
        int n=98;
        if(isOdd(n)){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }
    }

    private static boolean isOdd(int n) {
        return (n&1)==1;
    }
}
