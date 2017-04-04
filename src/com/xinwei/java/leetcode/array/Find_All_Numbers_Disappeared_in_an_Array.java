package com.xinwei.java.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinweiwang on 3/28/17.
 */

/*
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 */

/*
    思路: swap
 */
public class Find_All_Numbers_Disappeared_in_an_Array {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>();

        for(int i=0;i<nums.length; i++){

            if(nums[i]!=(i+1)&&nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
                i--;
            }

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res.add(i+1);
            }
        }
        return res;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }

}
