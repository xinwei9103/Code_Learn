package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

import java.util.LinkedList;

/**
 * Created by xinweiwang on 4/16/17.
 */
/*
Implement an iterator over a binary search tree (BST).
Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory,
where h is the height of the tree.

 */

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */

public class Binary_Search_Tree_Iterator {

    private LinkedList<TreeNode> stack;

    public Binary_Search_Tree_Iterator(TreeNode root) {
        stack = new LinkedList<>();
        pushNodes(root);
    }

    private void pushNodes(TreeNode node){
        while(node!=null) {
            stack.push(node);
            node = node.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }


    /** @return the next smallest number */
    public int next() {
        TreeNode node  = stack.pop();
        pushNodes(node.right);
        return node.val;
    }


}
