package com.azareelgg.hackerRank.preparation;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {
	
	public static void main(String[] args) {
		
		List<Integer> c = new ArrayList<>();
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		
		jumpingOnClouds(c);
	}
	
	
	public static int jumpingOnClouds(List<Integer> c) {
		
		if(c.isEmpty())
			return 0;
		
		int prev = 0, jump = 0;
		for (int i = 0; i < c.size(); i++) {
			
			if(i == 0) {
				prev = c.get(i);
				continue;
			}
			
			if(prev == 0 && c.get(i) == 1) {
				prev = c.get(i);
				//jump++;
				continue;
			}
			
			if(prev == 1 && c.get(i) == 0) {
				jump++;
				prev = c.get(i);
				continue;
			}
			
			if(i > 2 && prev == 0 && c.get(i) == 0) {
				
				if(c.get(i-2) == 0) {
					jump++;
					
				}
				prev = c.get(i);
			}
			
		}
		
		return jump;
	}

}
