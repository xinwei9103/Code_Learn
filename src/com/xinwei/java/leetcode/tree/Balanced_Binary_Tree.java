package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

/**
 * Created by xinweiwang on 4/16/17.
 */
/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary
tree in which the depth of the two subtrees of every node never differ by more than 1.
 */

/*
    可以之后尝试更简洁的解决方法
 */
public class Balanced_Binary_Tree {

    public boolean isBalanced(TreeNode root) {

        if(root ==null) return true;

        int l = helper(root.left);
        int r =helper(root.right);
        if(Math.abs(l-r)>1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }


    private int helper(TreeNode node){

        if(node == null) return 0;

        return 1+Math.max(helper(node.left),helper(node.right));

    }

}
