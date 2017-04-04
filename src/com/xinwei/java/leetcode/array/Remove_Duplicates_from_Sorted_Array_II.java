package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/28/17.
 */
/*
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5,
with the first five elements of nums being 1, 1, 2, 2 and 3.
It doesn't matter what you leave beyond the new length.
 */
public class Remove_Duplicates_from_Sorted_Array_II {

    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int step =1;
        int temp =nums[0];
        int count =1;

        for(int i=1;i<nums.length;i++){
            if(temp==nums[i]&&count>1){
                continue;
            }else if(temp!=nums[i]){
                temp = nums[i];
                count=1;
                nums[step++] = temp;
            }else{
                count++;
                nums[step++] = temp;
            }

        }
        return step;
    }


}
