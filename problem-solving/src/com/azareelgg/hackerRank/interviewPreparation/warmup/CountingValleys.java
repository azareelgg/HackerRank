package com.azareelgg.hackerRank.interviewPreparation.warmup;

public class CountingValleys {
	
	public static void main(String[] args) {
		
		System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
	}
	
	//https://www.hackerrank.com/challenges/counting-valleys/problem
	public static int countingValleys(int steps, String path){
		int seaLevel = 0, valleys=0;
        for (char c : path.toCharArray()) {
            if(c == 'U'){
                seaLevel++;
            }else if(c == 'D'){
                seaLevel--;
            }
            if(seaLevel == 0 && c == 'U')
                valleys++;
        }
        return valleys;
	}

}
