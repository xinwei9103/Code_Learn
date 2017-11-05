package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/14/17.
 */

/*
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */

/*
    思路: 先找到中点, 将中点之后的pointer反转
 */
public class Palindrome_Linked_List {

    public boolean isPalindrome(ListNode head) {

        if(head == null){
            return true;
        }

        ListNode fast =head;
        ListNode slow =head;

        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode mid = slow;
        ListNode next = slow.next;

        while(next!=null){
            ListNode temp =next.next;
            next.next = slow;
            slow =next;
            next =temp;
        }

        mid.next = null;

        while(head!=null&&slow!=null){

            if(head.val!=slow.val){
                return false;
            }
            head=head.next;
            slow = slow.next;
        }

        return true;
    }

}
