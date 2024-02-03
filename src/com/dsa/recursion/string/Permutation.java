package com.dsa.recursion.string;

import java.util.ArrayList;
import java.util.List;

//Time complexity - O(N * N!)
//Space complexity - O(N)
public class Permutation {
    public static void main(String[] args) {
        permutation("","abc");

        System.out.println("-------------------------");

        System.out.println(permutationList("", "abc"));
    }

    private static void permutation(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String start = p.substring(0,i);
            String end = p.substring(i,p.length());
            permutation(start+c+end, up.substring(1));
        }

    }

    private static List<String> permutationList(String p, String up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();

        char c = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String start = p.substring(0,i);
            String end = p.substring(i,p.length());
            ans.addAll(permutationList(start+c+end, up.substring(1)));
        }

        return ans;
    }
}
