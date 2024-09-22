package com.azareelgg.hackerRank.interviewPreparation.dictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckMagazine {
	
	public static void main(String[] args) {

		List<String> magazine = new ArrayList<>();
		/*magazine.add(1);
		magazine.add(1);
		magazine.add(1);
		magazine.add(0);
		magazine.add(0);*/
		magazine.add("hello");
		
		List<String> note = new ArrayList<>();
		note.add("hello1");

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
