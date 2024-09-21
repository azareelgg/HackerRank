package com.azareelgg.hackerRank.interviewPreparation.warmup;

public class RepeatedString {
	
	public static void main(String[] args) {
        long i = 1000000000000L;
		System.out.println(repeatedString("a", i));
	}
	
	//https://www.hackerrank.com/challenges/repeated-string/problem
	public static long repeatedString(String s, long n){
		long no = s.chars().filter(value -> value == 'a').count();
        long sSize = s.length();
        long mult = n/sSize;
        long noTotal = sSize * mult;

        no = no * mult;
        String remainingLetters = s.substring(0, Math.toIntExact(n - noTotal));
        return no + remainingLetters.chars().filter(value -> value == 'a').count();
	}

}
