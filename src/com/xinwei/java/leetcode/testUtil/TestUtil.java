package com.xinwei.java.leetcode.testUtil;

/**
 * Created by xinweiwang on 4/16/17.
 */
public class TestUtil {


    public static ListNode getListNodes(int n){
        ListNode head = new ListNode(1);
        ListNode node  = head;
        for(int i=2;i<=n;i++){
            node.next = new ListNode(i);
            node = node.next;
        }
        return head;
    }

    public static void printListNodes(ListNode node){

        while(node!=null){

            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println();

    }


}
