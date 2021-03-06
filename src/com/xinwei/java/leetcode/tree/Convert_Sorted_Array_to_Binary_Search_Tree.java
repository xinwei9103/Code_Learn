package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

/**
 * Created by xinweiwang on 4/17/17.
 */
/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
/*
    思路:类似于binary search
 */
public class Convert_Sorted_Array_to_Binary_Search_Tree {

    public TreeNode sortedArrayToBST(int[] nums) {

        return helper(nums,0,nums.length-1);

    }

    private TreeNode helper(int[] nums, int left, int right){

        if(left>right) return null;

        int mid = left +(right-left)/2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,left,mid-1);
        node.right = helper(nums,mid+1,right);
        return node;
    }
}
