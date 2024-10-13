package com.azareelgg.hackerRank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
	
	
	
	public static void main(String[] args) {
		
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> line = new ArrayList<>();
		line.add(11);
		line.add(2);
		line.add(4);
		arr.add(line);
		line = new ArrayList<>();
		
		line.add(4);
		line.add(5);
		line.add(6);
		arr.add(line);
		line = new ArrayList<>();
		
		line.add(10);
		line.add(8);
		line.add(-12);
		arr.add(line);
		
		System.out.println(diagonalDifference(arr));
		
	}
	
	//https://www.hackerrank.com/challenges/diagonal-difference/problem
	public static int diagonalDifference(List<List<Integer>> arr) {
		
		int diag1 = 0, diag2 = 0;
		for(int i = 0; i < arr.size(); i++) {
		
			diag1 += arr.get(i).get(i);
			diag2 += arr.get(i).get(arr.size() - 1 - i);
			
		}	
		return Math.abs(diag1 - diag2);
	}
}
