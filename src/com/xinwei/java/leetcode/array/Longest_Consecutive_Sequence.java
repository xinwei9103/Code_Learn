package com.xinwei.java.leetcode.array;

import java.util.HashMap;

/**
 * Created by xinweiwang on 3/1/17.
 */

/*
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
 */
/*
    思路: 利用hashmap 找出当前num所在的最长数列 sum 将当前数列的左右边界的值设为sum, 并把当前num的值也设为sum以防重复
    因为不会检查重复的值 所以每次检查秩序要找出当前num num-1,num+1 即可
 */

public class Longest_Consecutive_Sequence {

    public int longestConsecutive(int[] nums) {

        HashMap<Integer,Integer> res = new HashMap<>();
        /*
        for(int num:nums){
            res.put(num,0);
        }

        int max =0;

        for(Integer key:res.keySet()){

            max = Math.max(max,helper(key,res));

        }
        return max;
        */
        int max =0;
        for(int num:nums){
            if(!res.containsKey(num)){
                int left = res.getOrDefault(num-1,0);
                int right = res.getOrDefault(num+1,0);
                int sum = left+right+1;

                max = Math.max(max,sum);

                res.put(num-left,sum);
                res.put(num+right,sum);
            }
        }
        return max;
    }


    private int helper(Integer key,HashMap<Integer,Integer> res){
        if(!res.containsKey(key)){
            return 0;
        }else if(res.get(key)==0){
            int currentMax = 1+helper(key+1,res);
            res.put(key,currentMax);
            return currentMax;
        }else{
            return res.get(key);
        }
    }

    public static void main(String[] args) {

    }


}
