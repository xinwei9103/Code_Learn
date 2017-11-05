package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

/**
 * Created by xinweiwang on 4/16/17.
 */
/*
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class Same_Tree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

       return  helper(p,q);

    }


    private boolean helper(TreeNode p, TreeNode q){

        if(p!=null&&q!=null&&p.val==q.val){
            return helper(p.left,q.left)&&helper(p.right,q.right);
        }else if(q==null&&p==null){
            return true;
        }
        return false;
    }

}
