package br.com.tsouto;

import java.util.Scanner;


public class Solution {

    private static long askAndSum(int n, Scanner scanner) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextLong();
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(askAndSum(n, scanner));

    }
}
