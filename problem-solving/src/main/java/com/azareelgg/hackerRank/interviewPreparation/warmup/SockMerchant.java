package com.azareelgg.hackerRank.interviewPreparation.warmup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {
	
	public static void main(String[] args) {
		
		List<Integer> c = new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add(20);
		c.add(10);
		c.add(10);
		c.add(30);
		c.add(50);
		c.add(10);
		c.add(20);
		
		System.out.println(sockMerchant(9, c));
	}
	
	//https://www.hackerrank.com/challenges/sock-merchant/problem
	public static int sockMerchant(int n, List<Integer> ar) {
		Map<Integer, Integer> map = new HashMap<>();
        Integer tmp;
        for(int i = 0; i < ar.size(); i++){
            
            if(map.containsKey(ar.get(i))){
                tmp = map.get(ar.get(i));
                map.put(ar.get(i), ++tmp);
            }else{
                map.put(ar.get(i), 1);
            }
        }
        int ret = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer val = entry.getValue();
            if(val % 2 == 0){
                ret += val/2;
            }else if((val-1) % 2 == 0){
                ret += Math.ceil((val-1)/2);
            }
        }
        return ret;
	}

}
