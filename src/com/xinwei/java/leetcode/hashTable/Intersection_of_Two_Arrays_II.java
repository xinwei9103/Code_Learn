package com.xinwei.java.leetcode.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by xinweiwang on 4/26/17.
 */
/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
 */
public class Intersection_of_Two_Arrays_II {

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map =new HashMap<>();

        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list =new ArrayList<>();

        for(int num:nums2){
            if(map.getOrDefault(num,0)>0) {
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;

    }

}
