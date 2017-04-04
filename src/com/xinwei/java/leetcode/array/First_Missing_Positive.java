package com.xinwei.java.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by xinweiwang on 3/6/17.
 */
/*
Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space.
 */

/*
    思路: O(1) space 只能使用swap 将0<nums[i]<=nums.length 放到应该放的位置 [num[i]-1] 注意重复的数
 */
public class First_Missing_Positive {


    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i+1){
                continue;
            }
            if(nums[i]>0&&nums[i]<=nums.length){
                if(nums[i]==nums[nums[i]-1]){
                    continue;
                }
                swap(nums,nums[i]-1,i);
                i--;
            }
        }
        int step=1;
        while(step<=nums.length&&nums[step-1]==step){
            step++;
        }
        return step;
    }
    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


}
