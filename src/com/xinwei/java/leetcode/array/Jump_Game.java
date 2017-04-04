package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/19/17.
 */

/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.

 */

/*
    思路1: 从后往前 先定义一个boolean数组表示是否能到最后一个 超时
    思路2: 寻找0 因为只有0不能继续往前 找到0之后再找之前有没有可以越过0的元素 如果没有 则return false
    思路3: 思路1改进 找到可以到的最前面的点后 i=j 这样实现O(n)的时间
 */


public class Jump_Game {

    public boolean canJump(int[] nums) {

        for(int i=nums.length-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if((nums[j]+j)>=i){
                    i=j+1;
                    break;
                }else if(j==0&&(nums[j]+j<i)){
                    return false;
                }
            }
        }

        return true;

        /*
        if(nums.length==1&&nums[0]==0){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0) {
                boolean flag = false;
                for(int j=i-1;j>=0;j--){
                    if(nums[j]>i-j){
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    return false;
                }
            }
        }


        return true;
        */
    }

}
