package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/27/17.
 */

/*

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

从后面数的几个数挪到前面来

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 */


public class Rotate_Array {


    //新建一个数组 填过去
    public void rotate1(int[] nums, int k) {

         k = k%nums.length;

        int[] temp = new int[nums.length];

        for(int i=0,j=nums.length-k;i<k;i++,j++){

            temp[i] = nums[j];
        }

        for(int i=k,j=0;i<temp.length;i++,j++){

            temp[i] = nums[j];

        }

        for(int i=0;i<nums.length;i++){
            nums[i] = temp[i];
        }

    }



    //利用reverse
    public void rotate2(int[] nums, int k) {

        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);


    }

    private void reverse(int[] nums, int start, int end){

        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }

    }


}
