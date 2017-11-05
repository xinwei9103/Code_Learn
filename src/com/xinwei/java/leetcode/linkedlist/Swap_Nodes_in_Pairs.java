package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/16/17.
 */

/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space.
You may not modify the values in the list, only nodes itself can be changed.
 */

/*
    思路: 1 可以直接交换相邻两个 node 的pointer
          2 可以先分割list 根据odd和even 最后再组合
 */
public class Swap_Nodes_in_Pairs {

    public ListNode swapPairs(ListNode head) {

        ListNode pre = new ListNode(0);
        pre.next=head;
        ListNode res = pre;
        ListNode node =head;

        while(node!=null&&node.next!=null){
            ListNode temp = node.next.next;
            pre.next = node.next;
            node.next.next = node;
            node.next = temp;
            pre = node;
            node = node.next;
        }
        return res.next;
    }

}
