package com.xinwei.java.leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xinweiwang on 2/16/17.
 */

/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.
 */

/*
    思路 3 pointers
 */

public class Three_Sum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new LinkedList<>();

        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = nums.length-1;
            int target = -1*nums[i];

            while(start<end){
                if(nums[start]+nums[end]==target){
                    res.add(Arrays.asList(nums[i],nums[start++],nums[end]++));
                    while(start<end&&nums[start]==nums[start-1]) start++;
                    while(start<end&&nums[end]==nums[end+1]) end--;
                }else if(nums[start]+nums[end]>target){
                    end--;
                }else{
                    start++;
                }
            }

        }

        return res;

    }


}
