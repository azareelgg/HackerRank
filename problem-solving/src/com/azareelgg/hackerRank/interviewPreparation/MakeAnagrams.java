package com.azareelgg.hackerRank.interviewPreparation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MakeAnagrams {
	
	public static void main(String[] args) {
		
		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		
		System.out.println(makeAnagram3(a, b));
	}
	
	public static int makeAnagram(String a, String b) {
		
		Set<Character> set = new HashSet<>();
		List<Character> lst;
		char[] other;
		
		if(a.length() >= b.length()) {
			 lst = a.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
			 other = b.toCharArray();
		}else {
			lst = b.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
			other = a.toCharArray();
		}
		
		int anagram = 0;
		for(char bChar : other) {
			
			if(lst.contains(bChar)) {
				anagram++;
			}
			
		}
		
		return (a.length() - anagram)  + (b.length() - anagram);
	}

	
	public static int makeAnagram2(String a, String b) {
		Set<Character> aLst = a.chars().mapToObj(e -> (char)e).collect(Collectors.toSet());
		Set<Character> bLst = b.chars().mapToObj(e -> (char)e).collect(Collectors.toSet());
		
		Set<Character> tot = new HashSet<>();
		
		tot.addAll(aLst);
		tot.addAll(bLst);
		System.out.println("tot: " + (a.length() + b.length() - tot.size()));
		
		System.out.println(aLst + " -> " + aLst.size());
		System.out.println(bLst + " -> " + bLst.size());
		
		int anagram = 0;
		for (char c : b.toCharArray()) {
			if(!aLst.contains(c)) {
				anagram++;
			}
		}
		
		for (char c : a.toCharArray()) {
			if(!bLst.contains(c)) {
				anagram++;
			}
		}
		
		return anagram;
		
	}
	
	public static int makeAnagram3(String a, String b) {
		List<Character> aLst = a.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
		List<Character> bLst = b.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
		
		List<Character> tot = new ArrayList<>();
		
		System.out.println("tot: " + (a.length() + b.length() - tot.size()));
		
		System.out.println(aLst + " -> " + aLst.size());
		System.out.println(bLst + " -> " + bLst.size());
		
		int anagram = 0;
		for (char c : b.toCharArray()) {
			if(!aLst.contains(c)) {
				tot.add(c);
			}
		}
		
		
		for (char c : a.toCharArray()) {
			if(!bLst.contains(c)) {
				tot.add(c);
			}
		}
		
		return tot.size();
		
	}
}
