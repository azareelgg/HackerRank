/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azareelgg.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author azareel
 */
public class Day02 {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip0 = (float) tip_percent / 100;
        double tip = (float) meal_cost * tip0;
        double tax = (float) meal_cost * ((float)tax_percent / 100);
        double total = meal_cost + tip + tax;
        
        System.out.println(Math.round(total));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
