package com.azareelgg.hackerRank.interviewPreparation.stringManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class MakeAnagram {

    public static void main(String[] args) {
        System.out.println("");
    }

    public static int makeAnagram(String a, String b) {

        List<Character> alst = a.chars().mapToObj(c -> (char)c).toList();
        List<Character> blst = b.chars().mapToObj(c -> (char)c).toList();

        List<Character> lstToRemove = new ArrayList<>();

        for(Character c : alst){

            if(blst.contains(c)){

                blst.remove(blst.indexOf(c));
                lstToRemove.add(c);
 
            }

        }

        alst.removeAll(lstToRemove);


    return alst.size() + blst.size();
    }

}
