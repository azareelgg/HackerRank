package com.azareelgg.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author azareel
 */
public class Day03 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N % 2 == 0){//even
            if(N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }else if(N >= 6 && N <= 20){
                System.out.println("Weird");
            }else if(N >= 20){
                System.out.println("Not Weird");
            }
        }else{//odd
            System.out.println("Weird");
        }
        scanner.close();
    }
}
