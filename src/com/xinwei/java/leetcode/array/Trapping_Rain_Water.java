package com.xinwei.java.leetcode.array;

import java.util.LinkedList;

/**
 * Created by xinweiwang on 2/14/17.
 */

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example,
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */

/*
    思路: stack  可以用two pointers 更快 左右两边同时开始 每次用 min(left, right) 计算
 */
public class Trapping_Rain_Water {

    public int trap(int[] height) {

        LinkedList<Integer> stack = new LinkedList<>();

        int res =0;

        for(int start=0;start<height.length;start++){

            if(stack.isEmpty()){
                if(start==height.length-1||height[start+1]>=height[start]){

                }else{
                    stack.addLast(height[start]);
                }
            } else if(stack.size()==1&&stack.getLast()==height[start]){

            }else if(stack.getLast()>=height[start]){
                stack.addLast(height[start]);
            }else{
                int temp = 0;
                int count = 0;
                if(stack.getFirst()<=height[start]){
                    while(!stack.isEmpty()){
                        temp+=stack.getFirst()-stack.removeLast();
                    }
                }else{

                    while(stack.getLast()<height[start]){
                        count++;
                        temp+=height[start] - stack.removeLast();
                    }

                    while(count>0){
                        stack.addLast(height[start]);
                        count--;
                    }
                }
                stack.addLast(height[start]);
                res+=temp;
            }
        }


        return res;

    }

    public static void main(String[] args) {
        Trapping_Rain_Water trapping_rain_water = new Trapping_Rain_Water();

        System.out.println(trapping_rain_water.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }


}
