package com.xinwei.java.leetcode.array;

import java.util.Arrays;

/**
 * Created by xinweiwang on 2/20/17.
 */

/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
*/

/*

    思路: 找到比目前这个数大的最小的数
    1 从后往前找到第一个递减的数 这个数就是需要swap的数
    2 和从后往前第一个比这个数大的数swap
    For example, original number is 121543321, we want to swap the '1' at position 2 with '2' at position 7.
    3 sort 后面的数

 */
public class Next_Permutation {

    public void nextPermutation(int[] nums) {

        int i =nums.length-2;

        for(;i>=0;i--){
            if(nums[i]<nums[i+1]) break;
        }
        if(i==-1){
            Arrays.sort(nums);
            return;
        }
        int j = nums.length-1;

        for (;j>i;j--){
            if(nums[j]>nums[i]) break;
        }
        swap(i,j,nums);

        j = nums.length-1;
        i = i+1;
        while (i<j){
            swap(i,j,nums);
            i++;
            j--;
        }

    }


    private void swap(int i, int j , int[] nums){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

}
