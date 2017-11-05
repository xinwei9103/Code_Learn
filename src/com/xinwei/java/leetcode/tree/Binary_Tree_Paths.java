package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinweiwang on 4/25/17.
 */
/*
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 */
public class Binary_Tree_Paths {


    public List<String> binaryTreePaths(TreeNode root) {


        List<String> list = new ArrayList<>();

        if(root ==null) return list;
        helper(root,"",list);
        return list;
    }

    private void helper(TreeNode node,String current, List<String> list){

        if(current.isEmpty()) current+=node.val;
        else current+="->"+node.val;

        if(node.left==null&&node.right==null){

            list.add(current);
        }else if(node.left==null){
            helper(node.right,current,list);
        }else if(node.right==null){
            helper(node.left,current,list);
        }else{
            helper(node.right,current,list);
            helper(node.left,current,list);
        }

    }

}
