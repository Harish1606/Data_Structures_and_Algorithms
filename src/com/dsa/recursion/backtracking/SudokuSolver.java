package com.dsa.recursion.backtracking;

//Program to solve sudoku
//Time complexity - O(9^(N^2))
//Space complexity - O(N^2)
public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(solve(board)){
            display(board);
        }
        else{
            System.out.println("Cannot solve");
        }
    }

    private static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }

        if(emptyLeft){
            return true;
        }

        for(int num=1;num<=9;num++){
            if(isSafe(board, row, col, num)){
                board[row][col] = num;
                if(solve(board)){
                    return true;
                }
                else{
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    private static void display(int[][] board){
        for(int[] row : board){
            for(int num : row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[][] board, int row, int col, int num){
        for(int i=0;i<board.length;i++){
            if(board[i][col] == num){
                return false;
            }
        }

        for(int i=0;i<board[0].length;i++){
            if(board[row][i] == num){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int start = row - row % sqrt;
        int end = col - col % sqrt;
        for(int i=start;i<start+sqrt;i++){
            for(int j=end;j<end+sqrt;j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
