package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/12/17.
 */
/*
Write a function to delete a node (except the tail) in a singly linked list,

given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4

and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4

after calling your function.
 */

/*
 思路: 看linkedlist.next 是否为null, 将当前node的val改为next.val
 */

public class Delete_Node_in_a_Linked_List {



    public void deleteNode(ListNode node) {

        while(node.next!=null){
            node.val = node.next.val;
            if(node.next.next==null){
                node.next =null;
            }else {
                node = node.next;
            }
        }
    }

}
