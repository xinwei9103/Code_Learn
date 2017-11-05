package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/16/17.
 */
/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */

/*
    注意: 将一个node删掉后 pre不变
 */
public class Remove_Linked_List_Elements {


    public ListNode removeElements(ListNode head, int val) {

        ListNode pre = new ListNode(0);
        pre.next = head;

        ListNode res = pre;

        while(head!=null){

            if(val == head.val){
                pre.next = head.next;
            }else{
                pre = pre.next;
            }
            head = head.next;

        }
        return res.next;
    }

}
