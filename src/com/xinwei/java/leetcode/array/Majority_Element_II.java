package com.xinwei.java.leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xinweiwang on 3/5/17.
 */

/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
The algorithm should run in linear time and in O(1) space.
*/
/*
    思路: 不保证m1 m2 都是>1/3 所以最后要在判断 O(1) space
 */


public class Majority_Element_II {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new LinkedList<>();
        int c1 =0;
        int c2 =0;
        int m1 =0;
        int m2 =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m1){
                c1++;
            }else if(nums[i]==m2){
                c2++;
            }else if(c1==0){
                m1 = nums[i];
                c1++;
            }else if(c2==0){
                m2 = nums[i];
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m1){
                c1++;
            }else if(nums[i]==m2){
                c2++;
            }
        }
        if(c1>nums.length/3){
            res.add(m1);
        }
        if(c2>nums.length/3){
            res.add(m2);
        }
        return res;
    }
}
