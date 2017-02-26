package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/15/17.
 */

/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit.
You may complete as many transactions as you like
(ie, buy one and sell one share of the stock multiple times).
However, you may not engage in multiple transactions at the same
time (ie, you must sell the stock before you buy again).

 */

/*
    更简单 只要有利润就加起来
 */

public class Best_Time_to_Buy_and_Sell_Stock_II {

    public int maxProfit(int[] prices) {

        int sum = 0;

        int min = prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }else{
                sum+=prices[i]-min;
                min = prices[i];
            }
        }

        return sum;
    }


}
