package com.dsa.bitwise;

//To find XOR from a to b
//a^(a+1)^.....^b
public class RangeXor {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(findXor(b) ^ findXor(a-1));
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
