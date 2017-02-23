package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/14/17.
 */

/*
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
 */

/*
    思路 因为只加1 所以要进位必须是连续的9 要好好想想
 */

public class Plus_One {


    public int[] plusOne(int[] digits) {
/*

        int[] res = new int[digits.length + 1];

        int next = 1;

        int current = 0;

        for (int i = digits.length - 1; i >= 0; i--) {

            current = digits[i] + next;

            next = current / 10;

            res[i + 1] = current % 10;

        }

        if (next > 0) {
            res[0] = next;
            return res;
        } else {

            int[] newRes = new int[res.length - 1];

            for (int i = 0; i < newRes.length; i++) {

                newRes[i] = res[i + 1];
            }
            return newRes;
*/
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 >= 10) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;

    }

}
