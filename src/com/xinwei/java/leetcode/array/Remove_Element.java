package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/19/17.
 */

/*
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 */

/*
    思路 2 pointers swap
 */
public class Remove_Element {

    public int removeElement(int[] nums, int val) {

        int left = 0;
        int right = nums.length-1;



        while(left<=right){

            while(right>=0&&nums[right]==val) right--;

            while(left<nums.length&&nums[left]!=val) left++;

            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

        }

        return right+1;

    }

}
