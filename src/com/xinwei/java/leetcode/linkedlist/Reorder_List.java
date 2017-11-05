package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;
import com.xinwei.java.leetcode.testUtil.TestUtil;

/**
 * Created by xinweiwang on 4/15/17.
 */
/*
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
/*
    思路: 先分割在组合 将终点之后的顺序反置
 */

public class Reorder_List {

    public void reorderList(ListNode head) {

        if(head==null||head.next==null||head.next.next==null){
            return;
        }

        ListNode fast =head;
        ListNode slow = head;

        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //ListNode mid = slow;


        while(fast.next!=null){
            fast=fast.next;
        }

        ListNode last = fast;

        //System.out.println(slow.val);
        //System.out.println(fast.val);
        slow = slow.next;

        while(slow!=last){
            ListNode temp = fast.next;
            fast.next = slow;
            slow = slow.next;
            fast.next.next = temp;
        }

        //ListNode half = mid.next;
        //mid.next = null;


        //TestUtil.printListNodes(head);
        //TestUtil.printListNodes(last);

        ListNode node = head;

        while(node!=null&&last!=null){
            ListNode temp = last.next;
            last.next = node.next;
            node.next = last;
            last = temp;
            node = node.next.next;
        }
        //TestUtil.printListNodes(head);
    }

    public static void main(String[] args) {

        new Reorder_List().reorderList(TestUtil.getListNodes(10));


    }

}
