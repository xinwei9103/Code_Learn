package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;
import com.xinwei.scala.foundation_video.TraitLogger;

import java.util.LinkedList;

/**
 * Created by xinweiwang on 4/16/17.
 */
/*
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 */

/*
    思路: dp 固定node个数的 组合是一样的 并且指定root后 bst左右两边的tree的node的个数是一定的
 */
public class Unique_Binary_Search_Trees {

    public int numTrees(int n) {
        int[] res = new int[n+1];
        res[0]=1;
        res[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                res[i]+= res[j-1]*res[i-j];
            }

        }
        return res[n];
    }
}
