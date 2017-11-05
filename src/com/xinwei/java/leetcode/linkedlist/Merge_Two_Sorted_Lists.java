package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/12/17.
 */
/*
Merge two sorted linked lists and return it as a new list.
The new list should be made by splicing together the nodes of the first two lists
 */
public class Merge_Two_Sorted_Lists {

    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {

        ListNode head = new ListNode(0);
        head.next = node1;
        ListNode current = head;
        ListNode temp;
        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                node1 = node1.next;
            } else {
                temp = node2.next;
                node2.next = node1;
                current.next = node2;
                node2 = temp;
            }
            current = current.next;
        }
        if (node2 != null) {
            current.next = node2;
        }
        return head.next;

    }

}
