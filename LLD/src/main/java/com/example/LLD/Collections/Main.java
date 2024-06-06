package com.example.LLD.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

// Driver class to test above
class Main {
    public static void main(String[] args) {
//        Pair<String,Integer> p1=new Pair<>("RAJKAMAL",345);
//        ChildPair childPair =new ChildPair(124,"string");
//        GenericMethodExample genericMethodExample=new GenericMethodExample();
//        genericMethodExample.display("string","874t8348");
//        Pizza pizza=new Pizza();
//        System.out.println(pizza.getStatus());
//        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

        int [] nums = {1,2,2,1,2,3,1};
        int [][]queries = {{1,2},{3,3},{4,2}};

        Solution solution=new Solution();
        solution.unmarkedSumArray(nums,queries);
    }
}


class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> {//value,index
            if(a.getKey().intValue() == b.getKey().intValue())
                return a.getValue().intValue() - b.getValue().intValue();
            else
                return a.getKey().intValue()-b.getKey().intValue();
        });
        int[] markedIndexs = new int[nums.length];
        long sum = 0;
        long[] result = new long[queries.length];
        for(int i=0;i<nums.length;i++){
            pq.offer(new Pair<>(nums[i],i));
            sum += (long)nums[i];
        }
        for(int i = 0; i< queries.length;i++){
            if(markedIndexs[queries[i][0]] == 0){
                markedIndexs[queries[i][0]] =1;
                sum-=(long)nums[queries[i][0]];
            }
            int k = queries[i][1];
            while(k>0 && !pq.isEmpty()){
                var min = pq.poll();
                if(markedIndexs[min.getValue().intValue()] == 0){
                    markedIndexs[min.getValue().intValue()] = 1;
                    sum -= (long)nums[min.getValue().intValue()];
                    k--;
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
