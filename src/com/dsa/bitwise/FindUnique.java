package com.dsa.bitwise;

//Find unique element in the array
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 1, 4, 2};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique=0;
        for(int i : arr){
            unique^=i;
        }
        return unique;
    }
}
