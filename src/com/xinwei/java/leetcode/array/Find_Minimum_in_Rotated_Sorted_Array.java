package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/19/17.
 */

/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

!!You may assume no duplicate exists in the array.
 */

/*
    思路 binary search
 */

public class Find_Minimum_in_Rotated_Sorted_Array {

    public int findMin(int[] nums) {

        return binarySearch(0, nums.length - 1, nums);

    }


    private int binarySearch(int left, int right, int[] nums) {

        if (nums[left] <= nums[right]) return nums[left];
        if (right - left == 1) return Math.min(nums[left], nums[right]);

        int mid = (left + right) / 2;

        if (nums[mid] < nums[left]) {
            return binarySearch(left, mid, nums);
        } else {
            return binarySearch(mid, right, nums);
        }


    }

    public static void main(String[] args) {

        int[] test = new int[]{266, 267, 268, 269, 271, 278, 282, 292, 293, 298, 6, 9, 15, 19, 21, 26, 33, 35, 37, 38, 39, 46, 49, 54, 65, 71, 74, 77, 79, 82, 83, 88, 92, 93, 94, 97, 104, 108, 114, 115, 117, 122, 123, 127, 128, 129, 134, 137, 141, 142, 144, 147, 150, 154, 160, 163, 166, 169, 172, 173, 177, 180, 183, 184, 188, 198, 203, 208, 210, 214, 218, 220, 223, 224, 233, 236, 241, 243, 253, 256, 257, 262, 263};

        System.out.println(new Find_Minimum_in_Rotated_Sorted_Array().findMin(test));

    }


}



