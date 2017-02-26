package com.xinwei.java.leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xinweiwang on 2/20/17.
 */

/*
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note: The solution set must not contain duplicate quadruplets.

For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
*/

/*
    思路: 4 pointers 3个嵌套for循环
 */

public class Four_Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new LinkedList<>();

        Arrays.sort(nums);

        for(int i =0;i<nums.length-3;i++){

            if(i>0&&nums[i]==nums[i-1]) continue;

            for (int j = i+1;j<nums.length-2;j++){

                if(j>i+1&&nums[j]==nums[j-1]) continue;

                int left = j+1;

                int right = nums.length-1;

                int t = target-nums[i] - nums[j];

                while(left<right){

                    if(nums[left]+nums[right] == t){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left++],nums[right--]));
                        while(left<right&&nums[left]==nums[left-1]) left++;
                        while(left<right&&nums[right]==nums[right+1]) right--;
                    }else if(nums[left]+nums[right]>t){
                        right--;
                    }else{
                        left++;
                    }
                }

            }

        }

        return res;

    }

}
