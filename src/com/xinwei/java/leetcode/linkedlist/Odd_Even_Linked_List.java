package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/12/17.
 */
/*
Given a singly linked list, group all odd nodes together followed by the even nodes.
Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place.
The program should run in O(1) space complexity and O(nodes) time complexity.

Example:
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.

Note:
The relative order inside both the even and odd groups should remain as it was in the input.
The first node is considered odd, the second node even and so on ...

 */

/*
    思路: 是第单双个的node 不是node中的值 但思路一样 用两个head分别链接 even 和 odd 的node 最后合并
 */
public class Odd_Even_Linked_List {

    public ListNode oddEvenList(ListNode head) {

        if(head==null||head.next==null||head.next.next==null){
            return head;
        }
        ListNode oddHead = new ListNode(0);
        ListNode odd = oddHead;

        ListNode evenHead = new ListNode(0);
        ListNode even = evenHead;

        ListNode current = head;
        int step =0;
        while(current!=null){

            if(step%2==0){
                even.next = current;
                even =even.next;
            }else{
                odd.next = current;
                odd=odd.next;
            }
            current =current.next;
            step++;
        }

            even.next = oddHead.next;
            odd.next=null;
            return evenHead.next;


    }

}
