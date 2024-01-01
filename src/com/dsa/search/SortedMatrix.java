package com.dsa.search;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(matrix,15)));
    }

    static int[] search(int[][] matrix, int target){
        int rows=matrix.length,cols=matrix[0].length;
        if(rows==1){
            return binarySearch(matrix,0,0, cols-1, target);
        }
        int rowStart=0,rowEnd=rows-1,colMid=cols/2;
        while(rowStart<rowEnd-1){
            int mid = rowStart + (rowEnd-rowStart)/2;
            if(target==matrix[mid][colMid]){
                return new int[]{mid,colMid};
            }
            else if(target>matrix[mid][colMid]){
                rowStart=mid;
            }
            else{
                rowEnd=mid;
            }
        }

        if(matrix[rowStart][colMid]==target){
            return new int[]{rowStart,colMid};
        }
        if(matrix[rowStart+1][colMid]==target){
            return new int[]{rowStart+1,colMid};
        }

        if(target<=matrix[rowStart][colMid-1]){
            return binarySearch(matrix, rowStart, 0, colMid-1, target);
        }
        if(target>=matrix[rowStart][colMid+1] && target<=matrix[rowStart][cols-1]){
            return binarySearch(matrix, rowStart, colMid+1, cols-1, target);
        }
        if(target<=matrix[rowStart+1][colMid-1]){
            return binarySearch(matrix, rowStart+1, 0, colMid-1, target);
        }
        else{
            return binarySearch(matrix, rowStart+1, colMid+1, cols-1, target);
        }
    }

    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while(colStart<=colEnd){
            int mid=colStart + (colEnd-colStart)/2;
            if(target==matrix[row][mid]){
                return new int[]{row,mid};
            }
            else if(target>matrix[row][mid]){
                colStart=mid+1;
            }
            else{
                colEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
