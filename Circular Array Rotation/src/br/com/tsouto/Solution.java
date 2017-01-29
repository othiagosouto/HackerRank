package br.com.tsouto;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int index;
        for (int a_i = 0; a_i < n; a_i++) {
            if (a_i + k < n) {
                index =a_i+k;
            } else {
                if (k >= n) {
                    index = a_i + (k % n);
                    if (index >= n) {
                        index = index - n;
                    }
                } else {
                    index = (a_i + k) - n;
                }
            }
            a[(index)] = in.nextInt();
        }

        for (int a0 = 0; a0 < q; a0++) {
            int m = in.nextInt();
            System.out.println(a[m]);
        }
    }
}