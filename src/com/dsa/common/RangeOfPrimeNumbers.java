package com.dsa.common;

import java.util.Arrays;

//To find prime numbers from 1 to n
//Time complexity - O(N*log(log(N)))
//Space complexity - O(N)
public class RangeOfPrimeNumbers {
    public static void main(String[] args) {
        int n = 50;
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        rangeOfPrime(n, prime);
    }

    private static void rangeOfPrime(int n, boolean[] prime) {
        for(int i=2; i*i<=n; i++){
            if(prime[i]){
                for(int j=i*2; j<=n; j+=i){
                    prime[j]=false;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(prime[i])
                System.out.print(i+" ");
        }
    }

}
