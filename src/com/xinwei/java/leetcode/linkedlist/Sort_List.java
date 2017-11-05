package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.ListNode;

/**
 * Created by xinweiwang on 4/12/17.
 */
/*
Sort a linked list in O(n log n) time using constant space complexity.
 */
/*
思路: merge sort
 */
public class Sort_List {

    public ListNode sortList(ListNode node) {

        if(node==null){
            return node;
        }


        return mergeSort(node);
    }



    private ListNode mergeSort(ListNode head){

        if(head.next == null){
            return head;
        }

        ListNode fast = head;
        ListNode slow =head;
        while(fast.next!=null&&fast.next.next!=null){
            fast =fast.next.next;
            slow =slow.next;
        }
        ListNode node = slow.next;
        slow.next = null;

        ListNode node1 = mergeSort(head);
        ListNode node2 = mergeSort(node);
        return merge(node1,node2);
    }


    private ListNode merge(ListNode node1, ListNode node2){

        ListNode head = new ListNode(0);
        head.next = node1;
        ListNode current = head;
        ListNode temp;
        while(node1!=null&&node2!=null){
            if(node1.val<=node2.val){
                node1=node1.next;
            }else{
                temp = node2.next;
                node2.next = node1;
                current.next = node2;
                node2 = temp;
            }
            current = current.next;
        }
        if(node2!=null){
            current.next = node2;
        }
        return head.next;
    }

}
