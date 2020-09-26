package com.azareelgg.thirtydaysofcode;

import java.util.Scanner;

class Difference {
    private final int[] elements;
    public int maximumDifference;

    public Difference(int[] elements){
        this.elements = elements;
    }

    void computeDifference(){
        for (int i : elements) {
            for (int j : elements) {
                if ((j - i) > maximumDifference) {
                    maximumDifference = j - i;
                }
            }
        }
    }
}

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
