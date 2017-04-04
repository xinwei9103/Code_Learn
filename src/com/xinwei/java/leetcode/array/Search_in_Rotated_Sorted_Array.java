package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/28/17.
 */
/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
 */

/*
    思路: binary search
 */
public class Search_in_Rotated_Sorted_Array {

    public int search(int[] nums, int target) {

        int start =0;
        int end = nums.length-1;
        int pivot = -1;
        while(start<=end){

            int mid = start+(end-start)/2;

            if(mid!=0&&mid!=nums.length-1&&nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                pivot = mid;
                break;
            }else if(mid==0&&mid!=nums.length-1&&nums[mid]>nums[mid+1]){
                pivot = mid;
                break;
            }else if(nums[start]<=nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        if(pivot==-1){
            return binarySearch(nums,0,nums.length-1,target);
        }else if(target>=nums[0]){
            return binarySearch(nums,0,pivot,target);
        }else{
            return binarySearch(nums,pivot+1,nums.length-1,target);
        }
    }

    private int binarySearch(int[] nums, int left, int right, int target){

        if(right<left){
            return -1;
        }

        int mid = left+(right-left)/2;

        if(nums[mid]==target){
            return mid;
        }

        if(nums[mid]>target){
            return binarySearch(nums,left,mid-1,target);
        }else{
            return binarySearch(nums,mid+1,right,target);
        }

    }

    public static void main(String[] args) {

        int[] test = new int[]{5,1,3};

        System.out.println(new Search_in_Rotated_Sorted_Array().search(test,5));


    }


}
