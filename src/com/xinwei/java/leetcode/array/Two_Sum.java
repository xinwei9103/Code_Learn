package com.xinwei.java.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xinweiwang on 2/12/17.
 */

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.


Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class Two_Sum {

    /*
        如果需要返回的是index 则需要运用hashmap
        如果需要返回的是数 可以使用hashset 也可以先sort再two sum
     */

    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++){

            if(map.containsKey(target-nums[i])){
                solution[0] = map.get(target-nums[i]);
                solution[1] = i;
                return solution;
            }else{
                map.put(nums[i],i);
            }

        }

        return null;
    }
}
