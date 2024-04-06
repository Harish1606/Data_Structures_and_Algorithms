package com.dsa.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Non comparison sorting algorithm
//best for small numbers
//Time complexity - O(M)
//Space complexity - O(M)
//where m is the maximum element in the array
public class CountSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3, 8, 6, 2, 9};
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr){
        if(arr == null || arr.length == 1){
            return;
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }

        int[] countArr = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0){
                arr[index++] = i;
                countArr[i]--;
            }
        }
    }

    public static void countSortHash(int[] arr){
        if(arr == null || arr.length == 1){
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        Map<Integer,Integer> countMap = new HashMap<>();
        for(int num : arr){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            int count = countMap.getOrDefault(i,0);
            while (count > 0){
                arr[index++] = i;
                count--;
            }
        }
    }
}
