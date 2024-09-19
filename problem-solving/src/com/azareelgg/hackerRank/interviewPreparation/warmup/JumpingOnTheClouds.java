package com.azareelgg.hackerRank.interviewPreparation.warmup;

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
		
		System.out.println(jumpingOnClouds(c));
	}
	
	//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
	public static int jumpingOnClouds(List<Integer> c) {
		
		int index = 0;
		int jump = 0;
		while((index + 1) < c.size()){

			if((index + 2 < c.size()) && c.get(index + 2) == 0){
				index = index + 2;
			}else{
				index = index + 1;
			}
			
			jump++;
		}

		return jump;
	}

}
