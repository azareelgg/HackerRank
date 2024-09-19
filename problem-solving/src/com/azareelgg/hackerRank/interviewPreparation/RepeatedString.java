package com.azareelgg.hackerRank.interviewPreparation;

import java.util.List;
import java.util.stream.Collectors;

public class RepeatedString {
	
	public static void main(String[] args) {
		
		System.out.println(repeatedString("abcac", 10));
		System.out.println(repeatedString("aba", 10));
		System.out.println(repeatedString("a", 1000000000000L));
		
	}

	
	public static long repeatedString(String s, long n) {
		
		String string = "";
		for (int i = 0; i <= Math.abs(n / s.length()) ; i++) {
			//System.out.println("Valor: " + i);
			string += s;
		}
		//System.out.println(string.length());
		
		List<Character> list = string.substring(0, Math.toIntExact(n)).chars().mapToObj(e -> (char)e).collect(Collectors.toList()); 
		
		Long l = 0L;
		for (Character c : list) {
			if(c.equals('a')) {
				l++;
			}
		}
		
		return l;
	}
}
