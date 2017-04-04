package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/26/17.
 */

/*
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
*/
/*
    思路: running time nlog(n) binary search

    因为number between 1 -- n, mid = right/2 每次循环查整个数列有多少个数小于等于mid, 如果count>mid 说明重复的数存在于left-mid之间
    否则存在于mid+1 -- right 之间 如果mid是x 那么<=x的数的个数最多是x
 */

public class Find_the_Duplicate_Number {

    public int findDuplicate(int[] nums) {

        return find(1,nums.length,nums);
    }


    private int find(int left,int right, int[] nums){
        if(left==right) return left;

        int mid = left+(right-left)/2;
        int count =0;
        for(int num:nums){
            if(num<=mid) count++;
        }
        if(count>mid) return find(left,mid,nums);
        else return find(mid+1,right,nums);
    }

    public static void main(String[] args) {

        int[] test =  new int[]{2,1,2};

        System.out.println(new Find_the_Duplicate_Number().findDuplicate(test));

    }

}
