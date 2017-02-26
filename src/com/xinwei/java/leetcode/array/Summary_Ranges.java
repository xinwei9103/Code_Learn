package com.xinwei.java.leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xinweiwang on 2/22/17.
 */

/*
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
*/

public class Summary_Ranges {

    public List<String> summaryRanges(int[] nums) {

        List<String> res = new LinkedList<>();
        if(nums.length==0){
            return res;
        }
        if(nums.length==1){
            res.add(nums[0]+"");
            return res;
        }

        int begin = nums[0];

        for(int i =1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]+1){
                if(nums[i-1]>begin) res.add(begin+"->"+nums[i-1]);
                else res.add(begin+"");
                begin = nums[i];
            }
        }
        if(nums[nums.length-1]>nums[nums.length-2]+1){
            if(nums[nums.length-2]>begin) res.add(begin+"->"+nums[nums.length-2]);
            else res.add(begin+"");
            res.add(nums[nums.length-1]+"");
        }else{
            res.add(begin+"->"+nums[nums.length-1]);
        }
        return res;

    }
}
