package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

/**
 * Created by xinweiwang on 4/26/17.
 */
/*
Given a binary tree, find the length of the longest consecutive sequence path.

The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The longest consecutive path need to be from parent to child (cannot be the reverse).

For example,
   1
    \
     3
    / \
   2   4
        \
         5
Longest consecutive sequence path is 3-4-5, so return 3.
   2
    \
     3
    /
   2
  /
 1
Longest consecutive sequence path is 2-3,not3-2-1, so return 2.
 */

/*
    注意题目是让找从小到大的顺序
 */
public class Binary_Tree_Longest_Consecutive_Sequence {

    public int longestConsecutive(TreeNode root) {
        if(root==null) return 0;

        return Math.max(helper(root.left,1,root.val),helper(root.right,1,root.val));

    }


    private int helper(TreeNode node,int current, int lastValue){
        if(node==null) return current;

        if(node.val==lastValue+1) return Math.max(helper(node.left,current+1,node.val),helper(node.right,current+1,node.val));
        else return Math.max(helper(node.right,1,node.val),Math.max(current,helper(node.left,1,node.val)));
    }

}
