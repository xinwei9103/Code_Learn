package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/26/17.
 */

/*
Given a collection of intervals, merge all overlapping intervals.
For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
 */

/*
    思路: 暴力 分情况讨论 思路是res是按时间排序的 只需要找到区间
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Merge_Intervals {

    public class Interval{

        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
        public Interval() {
            this.start=0;
            this.end=0;
        }
    }


    public List<Interval> merge(List<Interval> intervals) {

        LinkedList<Interval> res = new LinkedList<>();

        for(Interval interval:intervals){
            if(res.isEmpty()){
                res.add(interval);
            }else{
                Interval start = null;
                Interval end = null;
                for(Interval current:res){
                    if(current.end>=interval.start&&start==null){
                        start = current;
                    }
                    if(current.end>=interval.end){
                        end = current;
                        break;
                    }
                }
                boolean remove = false;
                Iterator<Interval> it = res.iterator();
                Interval current = null;
                while(it.hasNext()){
                    current =it.next();
                    if(current==start) remove=true;
                    if(current==end) break;
                    if(remove &&current!=start) it.remove();
                }
                if(start==null){
                    res.add(interval);
                    continue;
                }
                if(interval.start<=start.start){
                    if(interval.end<start.start){
                        res.add(res.indexOf(start),interval);
                        continue;
                    }else{
                        start.start = interval.start;
                    }
                }
                if(end == null){
                    start.end = Math.max(interval.end,start.end);
                    continue;
                }
                if(interval.end<end.start){
                    start.end = Math.max(interval.end,start.end);
                }else{
                    start.end = Math.max(interval.end,end.end);
                    if(start!=end) res.remove(end);
                }
            }
        }


        return res;

    }

}
