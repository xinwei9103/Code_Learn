package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeLinkNode;

/**
 * Created by xinweiwang on 4/17/17.
 */

/*
Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
Populate each next pointer to point to its next right node.
If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree
(ie, all leaves are at the same level, and every parent has two children).
For example,
Given the following perfect binary tree,
         1
       /  \
      2    3
     / \  / \
    4  5  6  7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
 */

/*
    思路: 1 用stack 每次存一层
          2 用一个parent的pointer完成 left right分情况讨论
 */
public class Populating_Next_Right_Pointers_in_Each_Node {

    public void connect(TreeLinkNode root) {

        if(root==null) return;

        helper(root,root.left);
        helper(root,root.right);

    }

    private void helper(TreeLinkNode parent, TreeLinkNode node){
        if(node == null) return;

        if(node==parent.left){
            node.next = parent.right;
        }else{
            if(parent.next!=null){
                node.next = parent.next.left;
            }
        }
        helper(node,node.left);
        helper(node,node.right);

    }

}
