package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 3/15/17.
 */

/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time
(ie, you must sell the stock before you buy again).

 */

/*
思路: 4个参数
 */
public class Best_Time_to_Buy_and_Sell_Stock_III {

    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int oneTransactionProfit = 0;
        int firstTransactionPrice = Integer.MAX_VALUE;
        int currentValue = Integer.MAX_VALUE; //current price - one transaction profit (买-卖)

        for(int i=0;i<prices.length;i++){

            //总利润 = 当前价格 - 在第一个transaction之后的最小价格 + 第一个transaction的利润
            totalProfit = Math.max(totalProfit,prices[i]-currentValue);
            currentValue = Math.min(currentValue,prices[i]-oneTransactionProfit);

            //用于找到第一个transaction的最大利润
            oneTransactionProfit = Math.max(oneTransactionProfit,prices[i]-firstTransactionPrice);
            firstTransactionPrice = Math.min(firstTransactionPrice,prices[i]);
        }


        return totalProfit;
    }

}
