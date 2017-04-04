package com.xinwei.java.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinweiwang on 3/20/17.
 */

/*
Given a set of distinct integers, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */

/*
    思路: 递归
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res =new ArrayList<>();

        helper(nums,0,new ArrayList<>(),res);

        return res;

    }

    private void helper(int[] nums, int step, List<Integer> current, List<List<Integer>> res){

        res.add(new ArrayList<>(current));

        for(int i=step;i<nums.length;i++){
            current.add(nums[i]);
            helper(nums,step+1,current,res);
            current.remove(current.size()-1);
        }

    }

}
