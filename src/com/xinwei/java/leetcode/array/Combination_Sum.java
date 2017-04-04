package com.xinwei.java.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xinweiwang on 3/19/17.
 */

/*
Given a set of candidate numbers (C) (without duplicates) and a target number (T),
find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7,
A solution set is:
[
  [7],
  [2, 2, 3]
]
 */
/*
    思路: 递归 先对数组sort 在一层一层递归
 */
public class Combination_Sum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);

        helper(candidates,target,0,new LinkedList<>(),res);


        return res;
    }

    private void helper(int[] candidates, int target, int step, LinkedList<Integer> current, List<List<Integer>> res){

        for(int i=step;i<candidates.length;i++){
            int newTarget = target-candidates[i];
            if(newTarget<0){
                return;
            }else if(newTarget==0){
                current.add(candidates[i]);
                res.add(new ArrayList<>(current));
                current.removeLast();
                return;
            }else{
                current.add(candidates[i]);
                helper(candidates,newTarget,i,current,res);
                current.removeLast();
            }
        }



    }

}
