package br.com.tsouto.hackerrank;

import java.util.Scanner;

public class Solution {

    public static int getSum(int n, int[][] values) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumLeft += values[i][j];
                }
                if (i + j == n - 1) {
                    sumRight += values[i][j];
                }
            }
        }
        return Math.abs(sumLeft - sumRight);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] values = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                values[i][j] = scanner.nextInt();
            }
        }

        System.out.println(getSum(n, values));
    }
}
