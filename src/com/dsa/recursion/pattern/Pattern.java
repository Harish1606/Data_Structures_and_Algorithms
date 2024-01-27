package com.dsa.recursion.pattern;

public class Pattern {
    public static void main(String[] args) {
        pattern1(4, 0);
        pattern2(4, 0);
    }

    private static void pattern1(int r, int c) {
        if(r==0){
            return;
        }
        if(c < r){
            System.out.print("*");
            pattern1(r,c+1);
        }
        else{
            System.out.println();
            pattern1(r-1,0);
        }
    }

    private static void pattern2(int r, int c) {
        if(r==0){
            return;
        }
        if(c < r){
            pattern2(r,c+1);
            System.out.print("*");
        }
        else{
            pattern2(r-1,0);
            System.out.println();
        }
    }
}