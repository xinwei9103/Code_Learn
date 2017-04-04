package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/20/17.
 */
/*
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent,
with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
 */

/*
    思路: i=0 j=end i负责0  j负责2 1不管最后中间的为1 需要swap 否则将lost数据
 */
public class Sort_Colors {

    public void sortColors(int[] nums) {

        int i=0, j=nums.length-1;

        for(int step =0;step<=j;step++) {

            if(nums[step]==0){
                if(step==i){
                    i++;
                }else{
                    swap(nums,i,step);
                    i++;
                    step--;
                }
            }else if(nums[step]==2){
                if(step==j){
                    j--;
                }else{
                    swap(nums,j,step);
                    j--;
                    step--;
                }
            }

        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
