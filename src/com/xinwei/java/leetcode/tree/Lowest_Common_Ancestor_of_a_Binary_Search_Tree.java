package com.xinwei.java.leetcode.tree;

import com.xinwei.java.leetcode.testUtil.TreeNode;

/**
 * Created by xinweiwang on 4/16/17.
 */
/*
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia:
“The lowest common ancestor is defined between two nodes v and w as the lowest node in
 T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6.
Another example is LCA of nodes 2 and 4 is 2, since a node can be a
descendant of itself according to the LCA definition.
 */

/*
    思路 可以循环或者递归
 */
public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(p.val>q.val) return helper(root,q,p);

        return helper(root,p,q);

    }

    private TreeNode helper(TreeNode node, TreeNode p, TreeNode q){
        if(node==p||node==q) return node;
        else if(node.val>p.val&&node.val<q.val) return node;
        else if(node.val>q.val) return helper(node.left,p,q);
        else return helper(node.right,p,q);
    }
}
