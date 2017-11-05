package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

/**
 * Created by xinweiwang on 4/16/17.
 */
/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */
/*
    注意: 要记录 否则会丢失node
 */
public class Invert_Binary_Tree {

    public TreeNode invertTree(TreeNode root) {

        return helper(root);
    }


    private TreeNode helper(TreeNode node){

        if(node==null){
            return null;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;

        node.left = helper(right);
        node.right =helper(left);

        return node;

    }

}
