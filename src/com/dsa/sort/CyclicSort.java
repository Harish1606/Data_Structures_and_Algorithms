package com.dsa.sort;

import java.util.Arrays;

//Time complexity best - O(N), worst - O(N)
//Space complexity O(1)
//This sorting is used when the elements range is from 1 to N
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 3, 6, 4, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int t = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = t;
            }
            else{
                i++;
            }
        }
    }
}
