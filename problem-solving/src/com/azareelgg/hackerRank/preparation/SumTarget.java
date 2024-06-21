package com.azareelgg.hackerRank.preparation;

import java.util.Arrays;

public class SumTarget {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {0, 10, 3,5,-4,8,11,1,-1,6};
		int target = 10;
		
		System.out.println(Arrays.toString(sum(array, target)));
	}
	
	public static int[] sum(int[] array, int target) {
		
		int[] ret = new int[2];
		int sum;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array.length; j++) {
				
				if(i == j)
					continue;
				
				sum = array[i] + array[j];
				
				if(sum == target) {
					return new int[] {array[i], array[j]};
				}
				
			}
		}
		
		return ret;
		
	}

}
