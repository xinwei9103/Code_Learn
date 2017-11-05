package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TestUtil;
import com.xinwei.java.leetcode.testUtil.TreeNode;

/**
 * Created by xinweiwang on 4/16/17.
 */

/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along
the longest path from the root node down to the farthest leaf node.

 */

public class Maximum_Depth_of_Binary_Tree {

    public int maxDepth(TreeNode root) {

        return helper(root);
    }

    private int helper(TreeNode node){
        if(node==null){
            return 0;
        }

        return 1+Math.max(helper(node.left),helper(node.right));
    }

}
