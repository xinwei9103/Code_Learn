package com.xinwei.java.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by xinweiwang on 2/21/17.
 */
/*
Given an array of integers and an integer k,
find out whether there are two distinct indices i and j
in the array such that nums[i] = nums[j] and the absolute
difference between i and j is at most k.
*/

/*
    思路: window size k 用 HashSet
 */
public class Contains_Duplicate_II {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> window = new HashSet<>();
        int i =0;
        for(;i<nums.length&&i<k;i++){
            if(!window.add(nums[i])) return true;
        }
        for(;i<nums.length;i++){
            if(!window.add(nums[i])) return true;
            window.remove(nums[i-k]);
        }
        return false;
    }

}
