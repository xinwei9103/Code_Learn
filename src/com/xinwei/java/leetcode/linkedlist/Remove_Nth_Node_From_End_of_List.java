package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/15/17.
 */
/*
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */

/*
    思路: 先让快的pointer 走n步 注意只有一个node的情况
 */
public class Remove_Nth_Node_From_End_of_List {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;

        ListNode pre = new ListNode(0);
        pre.next = head;

        ListNode slow = pre;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next = slow.next.next;


        return pre.next;
    }

}
