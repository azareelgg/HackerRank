package com.azareelgg.hackerRank.technicalInterview;

public class ByteConstructor {

	ByteConstructor(int a, int b){
		System.out.println("a = " + a + " b = " + b);
	}

	ByteConstructor(int a, float b){
		System.out.println("a = " + a + " b = " + b);
	}
	
	public static void main(String[] args) {

		byte a = 10;
		byte b = 15;

		ByteConstructor test = new ByteConstructor(a,b);
	}
	
	
}
