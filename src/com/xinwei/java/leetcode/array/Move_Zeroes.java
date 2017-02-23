package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/13/17.
 */


/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */


/*
    不能改变数组的顺序
    思路: 2 pointers 不用互换 因为已知最后都是0
 */
public class Move_Zeroes {

    public void moveZeroes(int[] nums) {

        int pos =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos] = nums[i];
                pos++;
            }
        }

        for(;pos<nums.length;pos++){
            nums[pos]=0;
        }

    }

}
