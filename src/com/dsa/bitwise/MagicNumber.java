package com.dsa.bitwise;

//(1000) = ((0*5pow1)+(0*5pow2)+(0*5pow3)+(1*5pow4))
//time complexity - log(n)
public class MagicNumber {
    public static void main(String[] args) {
        int n = 8;
        int ans = 0;
        int base=5;
        while (n>0){
            int last = n & 1;
            n = n >> 1;
            ans += (last * base);
            base*=5;
        }

        System.out.println(ans);
    }
}
