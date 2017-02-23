package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/13/17.
 */

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

/*
    思路: 计算count 肯定多余一半
 */

public class Majority_Element {

    public int majorityElement(int[] num) {

        int res = num[0];

        int count = 1;

        for(int i=1;i<num.length;i++){

            if(num[i]==res){
                count++;
            }else{
                count--;
                if(count==0){
                    res = num[i];
                    count=1;
                }
            }

        }

        return res;
    }

}
