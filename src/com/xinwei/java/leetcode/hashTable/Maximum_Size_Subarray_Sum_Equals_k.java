package com.xinwei.java.leetcode.hashTable;

import java.util.HashMap;

/**
 * Created by xinweiwang on 7/12/17.
 */
/*
Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one, return 0 instead.

Note:
The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

Example 1:
Given nums = [1, -1, 5, -2, 3], k = 3,
return 4. (because the subarray [1, -1, 5, -2] sums to 3 and is the longest)

Example 2:
Given nums = [-2, -1, 2, 1], k = 1,
return 2. (because the subarray [-1, 2] sums to 1 and is the longest)

Follow Up:
Can you do it in O(n) time?


 */
public class Maximum_Size_Subarray_Sum_Equals_k {

    public int maxSubArrayLen(int[] nums, int k) {

        int max = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        int sum =0;

        for(int i=0;i<nums.length;i++){

            sum+=nums[i];

            if(sum==k){
                max = i+1;
            }else if(map.containsKey(sum-k)){
                max= Math.max(i-map.get(sum-k)+1,max);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return max;

    }

}
