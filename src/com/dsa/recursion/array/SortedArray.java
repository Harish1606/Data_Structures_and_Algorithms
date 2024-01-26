package com.dsa.recursion.array;

//Program to check if the array is sorted or not
public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 9};
        System.out.println(sorted(arr, 0));
    }

    private static boolean sorted(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
