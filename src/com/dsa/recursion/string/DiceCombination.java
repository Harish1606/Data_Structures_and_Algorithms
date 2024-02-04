package com.dsa.recursion.string;

//Program to find the number of combinations to get the target using dice
public class DiceCombination {
    public static void main(String[] args) {
        combination("",4);
    }

    private static void combination(String p, int target) {
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            combination(p+i,target-i);
        }
    }
}
