package com.dsa.common;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
        factors2(20);
    }

    //Time complexity - O(N)
    //Space complexity - O(1)
    private static void factors1(int n) {
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Time complexity - O(sqrt(N))
    //Space complexity - O(sqrt(N))
    private static void factors2(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                list.add(n/i);
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }

}
