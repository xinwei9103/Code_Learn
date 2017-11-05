package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/12/17.
 */
/*
Reverse a singly linked list.
 */

/*
    思路:
        1 新建一个list 将node insert到新list的head
        2 改变当前list的指针的方向
 */

public class Reverse_Linked_List {


    public ListNode reverseList(ListNode head) {

        if(head ==null){
            return head;
        }
        ListNode next = head.next;
        head.next =null;
        while(next!=null){
            ListNode node = next.next;
            next.next = head;
            head = next;
            next = node;
        }

        return head;
    }

}
