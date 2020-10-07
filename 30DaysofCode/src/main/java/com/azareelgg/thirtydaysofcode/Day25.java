package com.azareelgg.thirtydaysofcode;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        for (int number : numbers) {
            if (isPrime(number))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    public static boolean isPrime(int number){
        double numberSqrt = Math.sqrt(number);
        if(number <= 1)
            return false;
        else{
            for(int j = 2; j <= numberSqrt; j++) {
                if (number % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
