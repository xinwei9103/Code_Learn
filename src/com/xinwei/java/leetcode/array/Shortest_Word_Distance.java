package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 7/11/17.
 */
/*
Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

For example,
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.

Note:
You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 */
public class Shortest_Word_Distance {

    public int shortestDistance(String[] words, String word1, String word2) {

        int p1 = -1;

        int p2 = -1;

        int min = Integer.MAX_VALUE;

        for(int i=0;i<words.length;i++){
            if(word1.equals(words[i])){
                p1 = i;
                if(p2>=0&&p1-p2<min){
                    min = p1-p2;
                }
            }else if(word2.equals(words[i])){
                p2 = i;
                if(p1>=0&&p2-p1<min){
                    min = p2-p1;
                }
            }
        }
        return min;
    }

}
