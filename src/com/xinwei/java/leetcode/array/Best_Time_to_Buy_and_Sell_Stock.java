package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/15/17.
 */

/*

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction
(ie, buy one and sell one share of the stock),
design an algorithm to find the maximum profit.

 */

/*
感觉不算dp
 */

public class Best_Time_to_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {

        int max = 0;

        int min = prices[0];


        for(int i=1;i<prices.length;i++){
            if(prices[i]<=min){
                min = prices[i];
            }else{
                max=Math.max(max,prices[i]-min);
            }
        }

        return max;
    }

}
