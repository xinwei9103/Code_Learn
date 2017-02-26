package com.xinwei.java.leetcode.array;

import scala.Int;

/**
 * Created by xinweiwang on 2/21/17.
 */

/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],

the contiguous subarray [2,3] has the largest product = 6.
 */

/*
    思路: dp 每次更新包含最后一位的最大值和最小值
 */
public class Maximum_Product_Subarray {

    public int maxProduct(int[] nums) {

        int res = nums[0];

        int currentMax = nums[0];

        int currentMin = nums[0];

        for(int i=1;i<nums.length;i++){
            int max = currentMax;
            int min = currentMin;
            if(nums[i]<=0) {
                currentMax = Math.max(nums[i], min * nums[i]);
                currentMin = Math.min(nums[i], max * nums[i]);
            }else{
                currentMax = Math.max(nums[i],max*nums[i]);
                currentMin = Math.min(nums[i],min*nums[i]);
            }
            res = Math.max(currentMax,res);
        }

        return res;
    }

}
