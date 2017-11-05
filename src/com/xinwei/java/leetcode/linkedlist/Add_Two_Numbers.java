package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/12/17.
 */
/*
You are given two non-empty linked lists representing two non-negative integers.

The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

 */
public class Add_Two_Numbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

          ListNode start = new ListNode(0);
          ListNode node = start;
          int plusOne = 0;

          while(l1!=null&&l2!=null){
              int current = l1.val+l2.val+plusOne;
              plusOne = current/10;
              current = current%10;
              node.next = new ListNode(current);
              node = node.next;
              l1=l1.next;
              l2=l2.next;

          }
          while(l1!=null){
              int current = l1.val+plusOne;
              plusOne = current/10;
              current = current%10;
              node.next = new ListNode(current);

              l1=l1.next;
          }
          while(l2!=null){
              int current = l2.val+plusOne;
              plusOne = current/10;
              current = current%10;
              node.next = new ListNode(current);
              node = node.next;
              l2 =l2.next;
          }
          if(plusOne==1){
              node.next = new ListNode(1);
          }
          return start.next;
    }

}
