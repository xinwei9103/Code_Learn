package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;
import com.xinwei.java.leetcode.testUtil.TestUtil;

/**
 * Created by xinweiwang on 4/16/17.
 */
/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
 */

public class Reverse_Linked_List_II {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode pre = new ListNode(0);
        pre.next =head;
        ListNode res = pre;
        ListNode node = head;

        for(int i=1;i<m;i++){
            pre = node;
            node = node.next;
        }
        ListNode pointer = pre;
        ListNode last = pre.next;
        node=node.next;

        for(int i=m;i<n;i++){
            ListNode temp = pointer.next;
            pointer.next = node;
            last.next = node.next;
            node.next = temp;
            node = last.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        TestUtil.printListNodes(new Reverse_Linked_List_II().reverseBetween(TestUtil.getListNodes(5),2,4));
    }

}
