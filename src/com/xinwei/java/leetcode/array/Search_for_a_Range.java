package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 4/3/17.
 */
/*
Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */
public class Search_for_a_Range {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int left = binarySearch(nums,target,0);
        int right = binarySearch(nums,target,1);
        res[0]=left;
        res[1]=right;
        return res;
    }


    public int binarySearch(int[] nums,int target, int flag){
        return binarySearch(nums,0,nums.length-1,target,flag);
    }

    private int binarySearch(int[] nums, int left, int right,int target,int flag){

        if(left>right){
            return -1;
        }

        int mid = left+(right-left)/2;

        if(nums[mid]==target){
            if(flag==0&&mid!=0&&nums[mid-1]==target){
                return binarySearch(nums,left,mid-1,target,flag);
            }else if(flag==1&&mid!=nums.length-1&&nums[mid+1]==target){
                return binarySearch(nums,mid+1,right,target,flag);
            }else{
                return mid;
            }
        }else if(nums[mid]>target){
            return binarySearch(nums,left,mid-1,target,flag);
        }else{
            return binarySearch(nums,mid+1,right,target,flag);
        }

    }


    public static void main(String[] args) {

        System.out.println(new Search_for_a_Range().binarySearch(new int[]{2,3,3,3,4,5},3,1));

    }

}
