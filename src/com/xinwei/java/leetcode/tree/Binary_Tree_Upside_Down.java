package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

import java.util.LinkedList;

/**
 * Created by xinweiwang on 4/25/17.
 */
/*
Given a binary tree where all the right nodes are either leaf nodes with a
sibling (a left node that shares the same parent node) or empty,
flip it upside down and turn it into a tree where the original right
 nodes turned into left leaf nodes. Return the new root.

For example:
Given a binary tree {1,2,3,4,5},
    1
   / \
  2   3
 / \
4   5
return the root of the binary tree [4,5,2,#,#,3,1].
   4
  / \
 5   2
    / \
   3   1
 */

/*
    思路: 找到pointer的关系 递归 但是要注意在都走完后再改pointer
 */
public class Binary_Tree_Upside_Down {

    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode node =root;
        while(node.left!=null){
            node=node.left;
        }

        helper(root);
        return node;
    }

    private TreeNode helper(TreeNode node){
        if(node==null){
            return null;
        }
        TreeNode parent = helper(node.left);
        TreeNode left = helper(node.right);
        node.left=null;
        node.right=null;
        if(parent!=null) {
            parent.right = node;
            parent.left = left;
        }
        return node;
    }

}
