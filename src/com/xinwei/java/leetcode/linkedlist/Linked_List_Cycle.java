package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/12/17.
 */
/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */

/*
    思路: 一个走两步 一个走一步 查看能不能相遇
 */
public class Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {

        if(head == null){
            return false;
        }

        return helper(head,head);

    }


    private boolean helper(ListNode fast, ListNode slow){

        if(fast.next==null||fast.next.next == null){
            return false;
        }
        fast = fast.next.next;

        slow = slow.next;

        if(fast==slow){
            return true;
        }
        return helper(fast,slow);
    }
}
