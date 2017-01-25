package br.com.tsouto;

import java.util.Scanner;

public class Solution {


    public static String createLine(int line, int qtd) {
        StringBuilder builder = new StringBuilder("");

        while (builder.length() < qtd - line) {
            builder.append(" ");
        }

        while(builder.length() < qtd){
            builder.append("#");
        }
        return builder.toString();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtd = scanner.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.println(createLine(i, qtd));
        }
    }
}
