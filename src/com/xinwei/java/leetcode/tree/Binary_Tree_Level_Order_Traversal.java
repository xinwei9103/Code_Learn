package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.ListNode;
import com.xinwei.java.leetcode.testUtil.TreeNode;
import scala.Int;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xinweiwang on 4/25/17.
 */
/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 */
public class Binary_Tree_Level_Order_Traversal {


    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        TreeNode last =root;
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node = queue.removeFirst();
            list.add(node.val);
            if(node.left!=null) queue.addLast(node.left);
            if(node.right!=null) queue.addLast(node.right);
            if(node==last){
                if(!queue.isEmpty()) {
                    last = queue.getLast();
                }
                res.add(list);
                list = new ArrayList<>();
            }
        }

        return res;
    }


}
