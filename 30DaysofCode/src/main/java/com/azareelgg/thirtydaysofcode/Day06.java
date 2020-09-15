package com.azareelgg.thirtydaysofcode;

import java.util.Scanner;

public class Day06 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String input = "", even, odd;
        String[] out = new String[n];
        for(int i = 1; i <= n; i++){
            input = scanner.nextLine();
            char[] c = input.toCharArray();
            even = "";
            odd = "";
            for (int j=0; j<c.length; j++){
                if(j % 2 == 0){
                    even += c[j];
                }else{
                    odd += c[j];
                }
            }
            out[i-1] = even + " " + odd;
        }
        scanner.close();
        for(String s : out){
            System.out.println(s);
        }
    }
}
