package com.xinwei.java.leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by xinweiwang on 2/20/17.
 */

/*
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

 */

/*
    思路 3 pointers 比较差的绝对值 Math.abs
 */
public class Three_Sum_Closest {


    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        int res = 0;

        for(int i =0;i<nums.length;i++){

            if(i>0&&nums[i]==nums[i-1]) continue;

            int left = i+1;
            int right = nums.length-1;
            int t = target - nums[i];

            while(left<right){
                int current = nums[left] + nums[right];
                if(current == t) return target;
                if(min>Math.abs(t-current)){
                    min = Math.abs(t-current);
                    res = current+nums[i];
                }
                if(nums[left]+nums[right]>t){
                    right--;
                    while(left<right&&nums[right]==nums[right+1]) right--;
                }else{
                    left++;
                    while(left<right&&nums[left]==nums[left-1]) left++;
                }
            }

        }


        return res;
    }


}
