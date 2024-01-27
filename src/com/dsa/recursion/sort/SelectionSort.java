package com.dsa.recursion.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 4};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int r, int c, int max) {
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selectionSort(arr, r,c+1, c);
            }
            else{
                selectionSort(arr, r,c+1, max);
            }
        }
        else{
            int t = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = t;
            selectionSort(arr, r-1, 0, 0);
        }
    }


}
