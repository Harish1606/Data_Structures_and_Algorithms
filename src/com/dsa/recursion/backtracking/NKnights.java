package com.dsa.recursion.backtracking;

//Program to print the number of ways to place the N knights in the board
//Time complexity -  O(2^(N^2))
//Space complexity - O(N^2)
public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        numberOfWays(board, 0, 0, n);
    }

    private static void numberOfWays(boolean[][] board, int row, int col, int knights) {
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length-1 && col == board.length){
            return;
        }

        if(col == board.length){
            numberOfWays(board, row+1, 0, knights);
            return;
        }

        if(isSafe(board ,row, col)){
            board[row][col] = true;
            numberOfWays(board, row, col+1, knights-1);
            board[row][col] = false;
        }

        numberOfWays(board, row, col+1, knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board,row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        if(isValid(board,row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }

        if(isValid(board,row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

        if(isValid(board,row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
