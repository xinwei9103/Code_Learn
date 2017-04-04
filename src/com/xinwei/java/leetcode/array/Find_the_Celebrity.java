package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 4/3/17.
 */
/*
Suppose you are at a party with n people (labeled from 0 to n - 1) and among them, there may exist one celebrity. The definition of a celebrity is that all the other n - 1 people know him/her but he/she does not know any of them.

Now you want to find out who the celebrity is or verify that there is not one. The only thing you are allowed to do is to ask questions like: "Hi, A. Do you know B?" to get information of whether A knows B. You need to find out the celebrity (or verify there is not one) by asking as few questions as possible (in the asymptotic sense).

You are given a helper function bool knows(a, b) which tells you whether A knows B. Implement a function int findCelebrity(n), your function should minimize the number of calls to knows.

Note: There will be exactly one celebrity if he/she is in the party. Return the celebrity's label if there is a celebrity in the party. If there is no celebrity, return -1.
 */
public class Find_the_Celebrity {

    public int findCelebrity(int n) {

        int[] nonKnow = new int[n];
        int[] know = new int[n];


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&nonKnow[j]==0){
                    if(!knows(i,j)){
                        nonKnow[j]=1;
                    }else{
                        know[i]=1;
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            if(nonKnow[i]==0&&know[i]==0){
                boolean flag = true;
                for(int j=0;j<n;j++){
                    if(i!=j&&knows(i,j)){
                        flag=false;
                        break;
                    }
                }
                if(flag) return i;
            }
        }
        return -1;
    }

    boolean knows(int a, int b){
        return false;
    }

}
