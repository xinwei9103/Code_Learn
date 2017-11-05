package com.xinwei.java.leetcode.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by xinweiwang on 7/11/17.
 */
/*
This is a follow up of Shortest Word Distance. The only difference is now you are given the list of words and your method will be called repeatedly many times with different parameters. How would you optimize it?

Design a class which receives a list of words in the constructor, and implements a method that takes two words word1 and word2 and return the shortest distance between these two words in the list.

For example,
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.

Note:
You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 */

/*
 思路: 先存下每个word 的所有位置, 再进行比较
 */
public class Shortest_Word_Distance_II {

    /**
     * Your WordDistance object will be instantiated and called as such:
     * WordDistance obj = new WordDistance(words);
     * int param_1 = obj.shortest(word1,word2);
     */

    private HashMap<String, List<Integer>> map;

    public Shortest_Word_Distance_II(String[] words) {

        map = new HashMap<>();

        for(int i=0;i<words.length;i++){
            List<Integer> current;
            if(map.containsKey(words[i])){
                current = map.get(words[i]);
            }else{
                current = new ArrayList<>();
                map.put(words[i],current);
            }
            current.add(i);
        }
    }

    public int shortest(String word1, String word2) {

        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);
        int i=0, j=0, min = Integer.MAX_VALUE;

        while (i<l1.size()&&j<l2.size()){
            int p1 = l1.get(i);
            int p2 = l2.get(j);
            if(Math.abs(p1-p2)<min){
                min = Math.abs(p1-p2);
            }
            if(p1<p2){
                i++;
            }else{
                j++;
            }
        }

        return min;
    }

}
