package com.azareelgg.thirtydaysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            int i = map.getOrDefault(s, 0);
            if(i != 0){
                System.out.println(s+"="+i);
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
