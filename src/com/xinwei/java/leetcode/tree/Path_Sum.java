package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

import java.util.LinkedList;

/**
 * Created by xinweiwang on 4/25/17.
 */
/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class Path_Sum {

    public boolean hasPathSum(TreeNode root, int sum) {

        if(root==null){
            return false;
        }

        LinkedList<Integer> list = new LinkedList<>();


        return helper(root,sum,0,list);
    }


    private boolean helper(TreeNode node, int sum, int current, LinkedList<Integer> list){


        current += node.val;
        list.add(node.val);
        boolean res=false;
        if(node.left==null&&node.right==null){
            if(current==sum) res=true;
        }else if(node.left==null){
            res = helper(node.right,sum,current,list);
        }else if(node.right==null){
            res = helper(node.left,sum,current,list);
        }else{
            res = helper(node.left,sum,current,list)||helper(node.right,sum,current,list);
        }
        list.removeLast();
        return res;
    }


}
