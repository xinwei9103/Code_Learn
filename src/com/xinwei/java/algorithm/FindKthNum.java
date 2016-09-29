package com.xinwei.java.algorithm;

/**
 * Created by xinwei on 9/27/2016.
 */
public class FindKthNum {

    public static void main(String[] args) {
        int[] arr = {-1,2,0};
        System.out.println(findKthLargest(arr,1));
    }

    public static int findKthLargest(int[] nums, int k) {
        int smallk = nums.length - k;
        return helper(nums, 0, nums.length - 1, smallk);
    }

    private static int helper(int[] nums, int p, int r, int k) {
        int index = (int)(Math.random()*(r-p+1))+p;
        int n = partition(nums, p, r, index);
        if (n == k) {
            return nums[n];
        } else if (n < k) {
            return helper(nums, n + 1, r, k);
        } else {
            return helper(nums, p, n - 1, k);
        }
    }

    private static int partition(int[] nums, int p, int r, int index) {
        swap(nums, index, r);
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (nums[j] <= nums[r]) {
                i++;
                swap(nums, i, j);
            }
        }
        i++;
        swap(nums, i, r);
        return i;
    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
