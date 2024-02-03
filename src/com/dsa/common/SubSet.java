package com.dsa.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Time complexity - O(N * 2^N)
//Space complexity - O(N * 2^N)
public class SubSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = subSet(nums);
        for(List<Integer> list : ans){
            System.out.println(list);
        }

        System.out.println("------------------------------");

        int[] nums1 = {1, 2, 2};
        List<List<Integer>> ans1 = subSetDuplicate(nums1);
        for(List<Integer> list : ans1){
            System.out.println(list);
        }
    }

    //Create subset of array containing unique elements
    private static List<List<Integer>> subSet(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : nums){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    //Create subset of array containing duplicate elements
    private static List<List<Integer>> subSetDuplicate(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i=0;i<nums.length;i++){
            start = 0;
            if(i>0 && nums[i]==nums[i-1]){
                start = end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
