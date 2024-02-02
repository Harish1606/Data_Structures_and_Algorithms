package com.dsa.recursion.string;

import java.util.ArrayList;
import java.util.List;

//This class contains 3 different recursive ways to find the string subsequence
//Time complexity - O(2 ^ N)
//Space complexity - O(N)
public class SubSeq {
    public static void main(String[] args) {
        subseq1("","abc");

        List<String> list = new ArrayList<>();
        subseq2("", "abc", list);
        System.out.println(list);

        System.out.println(subseq3("", "abc"));
    }

    private static void subseq1(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char c = unprocessed.charAt(0);
        subseq1(processed + c, unprocessed.substring(1));
        subseq1(processed, unprocessed.substring(1));
    }

    private static void subseq2(String processed, String unprocessed, List<String> list) {
        if(unprocessed.isEmpty()){
            list.add(processed);
            return;
        }

        char c = unprocessed.charAt(0);
        subseq2(processed + c, unprocessed.substring(1), list);
        subseq2(processed, unprocessed.substring(1), list);
    }

    private static List<String> subseq3(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char c = unprocessed.charAt(0);
        List<String> left =  subseq3(processed + c, unprocessed.substring(1));
        List<String> right = subseq3(processed, unprocessed.substring(1));

        left.addAll(right);

        return left;
    }
}
