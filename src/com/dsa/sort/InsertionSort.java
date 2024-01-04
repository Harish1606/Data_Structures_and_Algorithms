package com.dsa.sort;

import java.util.Arrays;

//Time complexity best - O(N), worst - O(N*N)
//Space complexity O(1)
//It comes under stable sorting algorithm where order of the duplicate elements will not be changed
//It will also be part of hybrid sorting algorithms
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-5,-82,73,2,65,34};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
                else{
                    break;
                }
            }
        }
    }
}
