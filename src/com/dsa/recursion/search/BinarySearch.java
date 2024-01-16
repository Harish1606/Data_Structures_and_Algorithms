package com.dsa.recursion.search;

import java.util.Arrays;

//Uses divide and conquer recurrence
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23,1,4,65,97,5,47,54,61};
        Arrays.sort(arr);
        boolean isElementFound = binarySearch(arr,0,arr.length-1, 62);
        if (isElementFound)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }

    private static boolean binarySearch(int[] arr,int start, int end, int target) {

        if(start>end){
            return false;
        }

        int mid = start + (end-start)/2;

        if(target<arr[mid]){
            end=mid-1;
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            return true;
        }

        return binarySearch(arr, start, end, target);
    }
}
