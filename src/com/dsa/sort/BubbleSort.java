package com.dsa.sort;

import java.util.Arrays;

//Also called as Sinking sort or exchange sort
//Time complexity best - O(N), worst - O(N*N)
//Space complexity O(1)
//It comes under stable sorting algorithm where order of the duplicate elements will not be changed
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, -1, 0, 5, 4, 2, -8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
