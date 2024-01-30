package com.dsa.recursion.sort;

import java.util.Arrays;

//Time complexity - best case - O(N*log(N))
//Time complexity - worst case - O(N*N)
//Space complexity - O(N)
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e-s) / 2;
        int pivot = arr[mid];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }

        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
