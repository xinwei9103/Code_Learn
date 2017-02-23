package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/15/17.
 */


/*
Given an array of n integers where n > 1, nums,
return an array output such that output[i] is equal to the product
of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].
 */
/*

    思路: 分别从左右两边乘过来 最后res[i] = left[i-1]*right[i+1]
 */

public class Product_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        for(int i=1,sum = nums[0];i<output.length;i++){
            sum*=nums[i];
            output[i]=sum;
        }

        int sum = nums[nums.length-1];
        nums[nums.length-1] = output[nums.length-2];
        for(int i = nums.length-2;i>0;i--){
            int temp = nums[i];
            nums[i] = sum+output[i-1];
            sum *= temp;
        }
        nums[0] = sum;

        return nums;
    }


}
