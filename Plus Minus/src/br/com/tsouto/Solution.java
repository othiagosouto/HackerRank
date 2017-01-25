package br.com.tsouto;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {

    private static void printValues(int positiveCount, int negativesCount, int neutralCount, int n) {
        System.out.println(calculateFraction(n, positiveCount));
        System.out.println(calculateFraction(n, negativesCount));
        System.out.println(calculateFraction(n, neutralCount));
    }


    public static BigDecimal calculateFraction(int n, int count) {
        BigDecimal value = new BigDecimal(count).setScale(6, BigDecimal.ROUND_HALF_UP);
        return value.divide(new BigDecimal(n), 6, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int negativesCount = 0;
        int positiveCount = 0;
        int neutralCount = 0;
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val < 0) {
                negativesCount++;
            } else if (val > 0) {
                positiveCount++;
            } else {
                neutralCount++;
            }
        }

        printValues(positiveCount, negativesCount, neutralCount, n);
    }
}
