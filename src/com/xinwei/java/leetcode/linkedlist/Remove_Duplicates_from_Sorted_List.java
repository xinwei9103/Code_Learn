package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/16/17.
 */

/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class Remove_Duplicates_from_Sorted_List {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode pointer = head;
        while(pointer!=null){
            int temp = pointer.val;
            ListNode node = pointer.next;
            while(node!=null){
                if(node.val!=temp) break;
                node = node.next;
            }
            pointer.next = node;
            pointer = node;
        }
        return head;
    }

}
