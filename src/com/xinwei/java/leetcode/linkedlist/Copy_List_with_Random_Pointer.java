package com.xinwei.java.leetcode.linkedlist;

import com.xinwei.java.leetcode.testUtil.RandomListNode;

/**
 * Created by xinweiwang on 4/14/17.
 */
/*
A linked list is given such that each node contains an additional
random pointer which could point to any node in the list or null.

Return a deep copy of the list.

 */

/*
    思路: 三次循环 第一次将当前node的复制设为node.next
                 第二次设置random pointer
                 第三次将pointer 重置
 */

public class Copy_List_with_Random_Pointer {

    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null){
            return null;
        }

        RandomListNode node = head;

        while(node!=null){
            RandomListNode copyCurrent = new RandomListNode(node.label);
            copyCurrent.next = node.next;
            node.next = copyCurrent;
            node = copyCurrent.next;
        }

        node = head;
        //print(node);

        while(node!=null){
            if(node.random!=null){
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }

        RandomListNode res = head.next;

        node = head;

        while(node.next.next!=null){
            RandomListNode temp = node.next.next;
            node.next.next = temp.next;
            node.next = temp;
            node = node.next;
        }
        node.next=null;
        return res;
    }


    public void print(RandomListNode node){

        while(node!=null){
            System.out.print(node.label+" ");
            node=node.next;
        }

    }


    public static void main(String[] args) {

        RandomListNode node = new RandomListNode(1);
        node.random = node;
        //node.next = new RandomListNode()

        new Copy_List_with_Random_Pointer().copyRandomList(node);

    }

}
