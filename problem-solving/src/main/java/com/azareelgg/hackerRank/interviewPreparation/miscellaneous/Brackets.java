package com.azareelgg.hackerRank.interviewPreparation.miscellaneous;
import java.util.*;

public class Brackets {
    public static void main(String[] args) {
        String a = "()"; //output true
        brackets(a);
        String b = "()[]{}"; //output true
        brackets(b);
        String c = "(]"; //output false
        brackets(c);
        String d = "([])"; //output true
        brackets(d);


    }
    public static void brackets(String input){
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        boolean flag = false;
        Character key,val;
        
        for(int i = 0; i < input.length() / 2; i++) {
        	
        	key = input.charAt(i);
        	val = map.get(key);
        	
        	if(val == input.charAt(i + 1) || val == input.charAt(input.length() - i - 1)) {
        		flag = true;
        		i++;
        	}else {
        		break;
        	}
        	
        }
        System.out.println(flag);
    }
}
