package com.azareelgg.thirtydaysofcode;

import java.util.Scanner;

public class Day11 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,1,1,1,1,0},
                {0,1,0,0,0,0},
                {1,1,1,1,1,0},
                {0,1,0,1,0,0},
                {0,1,0,0,1,0},
                {0,0,2,0,2,4}
        };
/*
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
*/
        int x = 0, y = 0,r = 0, jump = 0;
        for(int w = 0; w <= 3; w++){

            for (x = 0; x <= 5; x++) {

                for (y = 0; y <= 2; y++) {
                    if ((x == 1 || x == 5) && (y == 0 || y == 2 || y == 3 || y == 5)) {
                        continue;
                    } else {
                        r += arr[x][y];
                    }
                }
            }
            jump = 3;
        }

        scanner.close();
    }
}
