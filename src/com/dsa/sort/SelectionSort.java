package com.dsa.sort;

import java.util.Arrays;

//Time complexity best - O(N*N), worst - O(N*N)
//Space complexity O(1)
//It comes under unstable sorting algorithm where order of the duplicate elements will be changed
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int lastIndex = arr.length-i-1;
            int maxIndex = findMaxIndex(arr, 0, lastIndex);
            int temp = arr[lastIndex];
            arr[lastIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    private static int findMaxIndex(int[] arr, int startIndex, int lastIndex) {
        int max = startIndex;
        for(int i=startIndex;i<=lastIndex;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }


}
