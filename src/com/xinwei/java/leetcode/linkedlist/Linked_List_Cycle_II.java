package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/15/17.
 */

/*
Given a linked list, return the node where the cycle begins.
If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?
 */
/*
    思路: 首先先用fast slow 找出是否有环
        如果有环 slow所在的位置到 begin 的距离 等于 head 到 begin的距离
 */
public class Linked_List_Cycle_II {

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;

        ListNode slow = head;

        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow =slow.next;
            if(fast==slow) break;
        }
        if(fast==null||fast.next==null||fast.next.next==null){
            return null;
        }

        while(head!=slow){
            slow=slow.next;
            head=head.next;
        }

        return slow;
    }


}
