package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/1/17.
 */

/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */


public class Missing_Number {

    public int missingNumber(int[] nums) {
        int sum =nums.length;
        for(int i=0;i<nums.length;i++){
            sum=sum+i-nums[i];
        }

        return sum;
    }

}
