package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/15/17.
 */

/*
Sort a linked list using insertion sort.
 */

public class Insertion_Sort_List {

    public ListNode insertionSortList(ListNode head) {

        ListNode start = new ListNode(Integer.MIN_VALUE);

        while(head!=null){

            ListNode pointer = start;
            while(pointer.next!=null){
                if(head.val>=pointer.val&&head.val<pointer.next.val){
                    ListNode temp = head.next;
                    head.next = pointer.next;
                    pointer.next = head;
                    head = temp;
                    break;
                }
                pointer =pointer.next;
            }
            if(pointer.next == null){
                ListNode temp = head.next;
                head.next = null;
                pointer.next = head;
                head = temp;
            }
        }

        return start.next;
    }

}
