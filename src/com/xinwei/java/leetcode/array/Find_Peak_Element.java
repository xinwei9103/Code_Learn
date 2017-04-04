package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/6/17.
 */
/*
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */

/*
    思路: binary search
 */
public class Find_Peak_Element {

    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }

        return binarySearch(nums,0,nums.length-1);
    }

    private int binarySearch(int[] nums,int left, int right){
        int mid = left+(right-left)/2;
        if(mid==0){
            if(nums[mid]>nums[mid+1]){
                return mid;
            }else{
                return binarySearch(nums,mid+1,right);
            }
        }
        if(mid==nums.length-1){
            if(nums[mid]>nums[mid-1]){
                return mid;
            }else{
                return binarySearch(nums,left,mid-1);
            }
        }
        if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
            return mid;
        }else if(nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1]){
            return binarySearch(nums,mid+1,right);
        }else{
            return binarySearch(nums,left,mid-1);
        }

    }

}
