package com.dsa.recursion.array;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazeWithObstacles("", maze, 0, 0);
    }

    //Program to print all the possible paths from one point to another containing obstacles and moving only in the down and right position.
    private static void mazeWithObstacles(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1){
            mazeWithObstacles(p+"D",maze,r+1,c);
        }

        if(c < maze[0].length-1){
            mazeWithObstacles(p+"R",maze,r,c+1);
        }
    }
}
