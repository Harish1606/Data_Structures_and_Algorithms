package com.dsa.search;

import java.util.Arrays;

//Time complexity O(logN)
//Space complexity O(1)
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23,1,4,65,97,5,47,54,61};
        Arrays.sort(arr);
        boolean isElementFound = binarySearch(arr,16);
        if (isElementFound)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
        System.out.println(ceiling(arr, 98));
        System.out.println(floor(arr, 0));
    }

    private static boolean binarySearch(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])
                end=mid-1;
            else if(target > arr[mid])
                start = mid+1;
            else
                return true;
        }
        return false;
    }

    private static int ceiling(int[] arr, int target) {
        int start=0,end=arr.length-1;
        if(target > arr[arr.length-1])
            return -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])
                end=mid-1;
            else if(target > arr[mid])
                start = mid+1;
            else
                return arr[mid];
        }
        return arr[start];
    }

    private static int floor(int[] arr, int target) {
        int start=0,end=arr.length-1;
        if(target < arr[0])
            return -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])
                end=mid-1;
            else if(target > arr[mid])
                start = mid+1;
            else
                return arr[mid];
        }
        return arr[end];
    }

}

