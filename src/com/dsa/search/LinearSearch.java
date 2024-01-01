package com.dsa.search;

//Time complexity O(N)
//Space complexity O(1)
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={23,1,4,65,97,5,47,54,61};
        boolean isElementFound = linearSearch(arr, 16);
        if(isElementFound)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }

    private static boolean linearSearch(int[] arr, int target) {
        for(int element : arr){
            if(target == element){
                return true;
            }
        }
        return false;

    }


}
