package com.azareelgg.hackerRank.interviewPreparation.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HourglassSum {
	
	public static void main(String[] args) {
		List<List<Integer>> mtrx = new ArrayList<>();

		List<Integer> line = new ArrayList<>();
		line.add(1);
		line.add(1);
		line.add(1);
		line.add(0);
		line.add(0);
		line.add(0);
		mtrx.add(line);
		
		line = new ArrayList<>();
		line.add(0);
		line.add(1);
		line.add(0);
		line.add(0);
		line.add(0);
		line.add(0);
		mtrx.add(line);

		line = new ArrayList<>();
		line.add(1);
		line.add(1);
		line.add(1);
		line.add(0);
		line.add(0);
		line.add(0);
		mtrx.add(line);

		line = new ArrayList<>();
		line.add(0);
		line.add(0);
		line.add(2);
		line.add(4);
		line.add(4);
		line.add(0);
		mtrx.add(line);

		line = new ArrayList<>();
		line.add(0);
		line.add(0);
		line.add(0);
		line.add(2);
		line.add(0);
		line.add(0);
		mtrx.add(line);

		line = new ArrayList<>();
		line.add(0);
		line.add(0);
		line.add(1);
		line.add(2);
		line.add(4);
		line.add(0);
		mtrx.add(line);

		
		System.out.println(hourglassSum(mtrx));
	}
	
	//https://www.hackerrank.com/challenges/2d-array/problem
	public static int hourglassSum(List<List<Integer>> arr) {
		
		int a = 0;
		List<Integer> res = new ArrayList<>();

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				a = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
				  + arr.get(i + 1).get(j + 1)
				  + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
				  
				res.add(a);
			}
		}

		return Collections.max(res);
	}

}
