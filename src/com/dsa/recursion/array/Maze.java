package com.dsa.recursion.array;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        System.out.println(pathCount(3,3));
        System.out.println("--------------------");
        path("",3,3);
        System.out.println("--------------------");
        System.out.println(pathList("",3,3));
        System.out.println("--------------------");
        System.out.println(pathDiagonal("",3,3));
    }

    //Program to find the number of path from one point to another moving only in the down and right position.
    private static int pathCount(int r, int c) {
        if(r==1 || c==1){
            return 1;
        }

        int down = pathCount(r-1,c);
        int right = pathCount(r,c-1);

        return down+right;
    }

    //Program to print all the possible paths from one point to another moving only in the down and right position.
    private static void path(String p, int r, int c) {
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+"D",r-1,c);
        }

        if(c>1){
            path(p+"R",r,c-1);
        }
    }

    //Program to add all the possible paths into the list from one point to another moving only in the down and right position.
    private static List<String> pathList(String p, int r, int c) {
        if(r==1 && c==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(pathList(p+"D",r-1,c));
        }

        if(c>1){
            ans.addAll(pathList(p+"R",r,c-1));
        }

        return ans;
    }

    //Program to add all the possible paths into the list from one point to another moving in down, right and diagonal position.
    private static List<String> pathDiagonal(String p, int r, int c) {
        if(r==1 && c==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        if(r>1){
            ans.addAll(pathDiagonal(p+"V",r-1,c));
        }

        if(r>1 && c>1){
            ans.addAll(pathDiagonal(p+"D",r-1,c-1));
        }

        if(c>1){
            ans.addAll(pathDiagonal(p+"H",r,c-1));
        }

        return ans;
    }
}
