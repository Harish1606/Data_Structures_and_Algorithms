package com.dsa.recursion.search;

import java.util.ArrayList;

public class LinearSearch {
    private static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 7, 9};
        System.out.println(findElement(arr, 6, 0));
        System.out.println(findIndex(arr, 6, 0));
        System.out.println(findLastIndex(arr, 6, arr.length-1));
        System.out.println(findAllIndex(arr, 6, 0));
    }

    private static boolean findElement(int[] arr, int target, int index) {
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || findElement(arr, target, index+1);
    }

    private static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length){
            return -1;
        }
        return arr[index] == target ? index : findIndex(arr, target, index+1);
    }

    private static int findLastIndex(int[] arr, int target, int index) {
        if(index == -1){
            return -1;
        }
        return arr[index] == target ? index : findLastIndex(arr, target, index-1);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] ==  target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1);
    }

}
