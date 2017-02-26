package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/15/17.
 */

/*
Find the contiguous subarray within an array
(containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
*/

/*
思路: dp 一维 代表当前值是subarray的最后一位时 最大的值
    也可以用 divide and conquer 来写
    要maintain 4个值
l: the sum of the sub array with largest sum starting from the first element
m: the sum of the sub array with largest sum
r: the sum of the sub array with largest sum ending at the last element
s: the sum of the whole array

        l = max(v1.l, v1.s + v2.l);
        m = max(v1.r + v2.l, max(v1.m, v2.m));
        r = max(v2.r, v1.r + v2.s);
        s = v1.s + v2.s;
 */

public class Maximum_Subarray {

    public int maxSubArray(int[] nums) {
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            nums[i] = Math.max(nums[i],nums[i]+nums[i-1]);
            if(nums[i]>max){
                max = nums[i];
            }
        }


        return max;
    }

}
