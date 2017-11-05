package com.xinwei.java.leetcode.hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by xinweiwang on 4/26/17.
 */

/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 */
public class Intersection_of_Two_Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set =new HashSet<>();

        for(int num:nums1){
            set.add(num);
        }
        ArrayList<Integer> list =new ArrayList<>();

        for(int num:nums2){
            if(set.remove(num)) list.add(num);
        }
        int[] res = new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }

}
