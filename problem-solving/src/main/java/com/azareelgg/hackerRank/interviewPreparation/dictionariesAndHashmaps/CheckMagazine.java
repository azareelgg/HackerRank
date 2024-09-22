package com.azareelgg.hackerRank.interviewPreparation.dictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckMagazine {
	
	public static void main(String[] args) {

		List<String> magazine = new ArrayList<>();
		magazine.add("two");
		magazine.add("times");
		magazine.add("three");
		magazine.add("is");
		magazine.add("not");
		magazine.add("four");
		
		List<String> note = new ArrayList<>();
		note.add("two");
		note.add("times");
		note.add("two");
		note.add("is");
		note.add("four");

		checkMagazine(magazine, note);
	}
	
	//https://www.hackerrank.com/challenges/ctci-ransom-note/problem
	public static void checkMagazine(List<String> magazine, List<String> note) {

		boolean f = false;
		for(String n : note){

			if(magazine.contains(n)){
				magazine.remove(magazine.indexOf(n));
			}else{
				System.out.println("No");
				f = true;
				break;
			}

		}
		if(!f){
			System.out.println("Yes");
		}
	}

}
