package com.dsa.common;

import java.util.ArrayList;
import java.util.List;

//Leetcode problem no - 368
//Time limit exceeded
public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums = {5,9,18,54,108,540,90,180,360,720};
        System.out.println(subSet(nums));
    }

    private static List<Integer> subSet(int[] nums) {
        int max = 0;
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : nums){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if(factors(internal) && internal.size() > max){
                    max = internal.size();
                    ans = new ArrayList<>(internal);
                }
                outer.add(internal);
            }
        }

        return ans;
    }

    private static boolean factors(List<Integer> nums){
        for(int i=0;i<nums.size()-1;i++){
            for(int j=i+1;j<nums.size();j++){
                int min = Math.min(nums.get(i),nums.get(j));
                int max = Math.max(nums.get(i),nums.get(j));
                if(max % min != 0){
                    return false;
                }
            }

        }
        return true;
    }
}
