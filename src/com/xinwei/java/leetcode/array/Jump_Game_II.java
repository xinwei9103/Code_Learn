package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/28/17.
 */
/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

Note:
You can assume that you can always reach the last index.
 */
public class Jump_Game_II {


    public int jump(int[] nums) {
        int res =0;
        for(int i=0;i<nums.length-1;){
            int max = i+nums[i];
            res++;
            boolean flag =false;
            for(int j=i+1;j<nums.length-1&&j<=i+nums[i];j++){
                if(max>=nums.length-1){
                    return res;
                }
                if(max<j+nums[j]){
                    max= j+ nums[j];
                    if(!flag){
                        res++;
                        flag = true;
                    }
                }
            }
            i=max;
        }
        return res;
    }




    public static void main(String[] args) {

        System.out.println(new Jump_Game_II().jump(new int[]{1,1,1,1,1}));


    }

}
