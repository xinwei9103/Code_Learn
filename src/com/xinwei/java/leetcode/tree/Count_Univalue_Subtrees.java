package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

/**
 * Created by xinweiwang on 4/25/17.
 */
/*
Given a binary tree, count the number of uni-value subtrees.

A Uni-value subtree means all nodes of the subtree have the same value.

For example:
Given binary tree,
              5
             / \
            1   5
           / \   \
          5   5   5
return 4.
 */
public class Count_Univalue_Subtrees {

    public int countUnivalSubtrees(TreeNode root) {

        return helper(root);

    }

    private int helper(TreeNode node){
        if(node==null) return 0;

        int left = helper(node.left);
        int right = helper(node.right);
        int countLeft = countNode(node.left);
        int countRight = countNode(node.right);
        if(left==0&&right==0){
            return 1;
        }else if(left==0){
            if(right==countRight&&node.val==node.right.val) return 1+right;
            else return right;
        }else if(right==0){
            if(left==countLeft&&node.val==node.left.val) return 1+left;
            else return left;
        }else{
            if(left==countLeft&&right==countRight&&node.val==node.right.val&&node.val==node.left.val){
                return 1+left+right;
            }else{
                return left+right;
            }
        }

    }

    private int countNode(TreeNode node){
        if(node==null) return 0;

        return 1+countNode(node.left)+countNode(node.right);
    }

}
