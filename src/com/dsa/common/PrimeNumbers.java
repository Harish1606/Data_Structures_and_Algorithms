package com.dsa.common;

//Time complexity - O(sqrt(N))
//Space complexity - O(1)
public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
