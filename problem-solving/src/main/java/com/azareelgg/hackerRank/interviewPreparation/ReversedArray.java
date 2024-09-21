package com.azareelgg.hackerRank.interviewPreparation;

import java.util.ArrayList;
import java.util.List;

public class ReversedArray {
	
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(4);
		lst.add(3);
		lst.add(2);
		
		System.out.println(reverseArray(lst).toString());
		
	}
	
	public static List<Integer> reverseArray(List<Integer> a) {
		
		List<Integer> ret = new ArrayList<>();
		
		for (int i = a.size(); i > 0; i--) {
			
			ret.add(a.get(i-1));
			
		}
		return ret;
	}

}
