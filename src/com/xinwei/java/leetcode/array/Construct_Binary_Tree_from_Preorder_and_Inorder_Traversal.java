package com.xinwei.java.leetcode.array;

import apple.laf.JRSUIUtils;
import com.xinwei.java.leetcode.testUtil.TreeNode;

import java.util.LinkedList;

/**
 * Created by xinweiwang on 3/21/17.
 */

/*
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.
 */

/*
    思路: stack
 */

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {






    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return helper(preorder,inorder,0,0,inorder.length-1);
        /*
        LinkedList<Integer> stack = new LinkedList<>();

        int i=0, j=0;

        TreeNode root =null;
        TreeNode node =null;
        while(i<preorder.length){
            while(stack.isEmpty()||stack.peek()!=inorder[j]){
                stack.push(preorder[i++]);
            }
            TreeNode newNode = new TreeNode(stack.pop());
            newNode.left = node;
            node = newNode;
            j++;
            if(j<inorder.length&&i<preorder.length&&inorder[j]==preorder[i]){
                node.right = new TreeNode(preorder[i]);
                i++;
                j++;
            }
            if(root==null&&stack.isEmpty()){
                root = node;
                node =null;
            }
        }
        //System.out.println(stack.size());
        if(!stack.isEmpty()){
            TreeNode newNode = new TreeNode(stack.pop());
            newNode.left = node;
            node = newNode;
            root.right=node;
        }


        return  root;
        */
    }

    private TreeNode helper(int[] preorder,int[] inorder,int preStart,int inStart,int inEnd){
        if(inStart>inEnd){
            return null;
        }
        int val=preorder[preStart];
        TreeNode node=new TreeNode(val);
        int count=0;
        int i=inStart;
        for( ;i<=inEnd;i++){
            if(inorder[i]==val){
                break;
            }
            count++;
        }
        node.left=helper(preorder,inorder,preStart+1,inStart,i-1);
        node.right=helper(preorder,inorder,preStart+count+1,i+1,inEnd);
        return node;

    }

    public static void preorder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);

    }

    public static void main(String[] args) {

        TreeNode node = new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal().buildTree(
                new int[]{1,2,3},new int[]{2,3,1});
        Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal.preorder(node);



    }

}
