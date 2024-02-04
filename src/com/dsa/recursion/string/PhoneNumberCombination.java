package com.dsa.recursion.string;

import java.util.ArrayList;
import java.util.List;

//leetcode problem no - 17
public class PhoneNumberCombination {
    private static List<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combination("","23", letters);
        System.out.println(ans);
    }

    private static void combination(String p, String up, String[] letters) {
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        String letter = letters[(up.charAt(0)-'0')-2];
        for(int i=0;i<letter.length();i++){
            combination(p + letter.charAt(i), up.substring(1), letters);
        }

    }
}
