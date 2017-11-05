package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/12/17.
 */
/*
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */

/*
    思路: 先跑两边记录长度 然后长得那边先走相差的数量 最后一起走来对比
 */

public class Intersection_of_Two_Linked_Lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lengthA = 0;
        int lengthB =0;
        ListNode a = headA;
        ListNode b = headB;
        while(a!=null){
            lengthA++;
            a = a.next;
        }
        while(b!=null){
            lengthB++;
            b = b.next;
        }
        a = headA;
        b = headB;

        if(lengthA>lengthB){
            for(int i=0;i<lengthA-lengthB;i++){
                a=a.next;
            }
        }else if(lengthB>lengthA){
            for(int i=0;i<lengthB-lengthA;i++){
                b=b.next;
            }
        }

        while(a!=null&&b!=null){
            if(a==b){
                return a;
            }
            a = a.next;
            b = b.next;
        }

        return null;
    }

}
