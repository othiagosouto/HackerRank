package br.com.tsouto.hackerrank;

import java.util.Scanner;

public class Solution {


    private static final int HOURS_INDEX = 0;

    public static String convert(String date) {
        String[] splitted = date.split(":");
        String value = date;
        if (date.contains("AM")) {
            int parsedValue = Integer.parseInt(splitted[HOURS_INDEX]);
            if (parsedValue == 12) {
                value = value.replace(splitted[HOURS_INDEX], "00");
            }

        } else {
            int parsedValue = Integer.parseInt(splitted[HOURS_INDEX]);
            Integer integer = parsedValue < 12 ? parsedValue + 12 : parsedValue;
            value = value.replace(splitted[HOURS_INDEX], integer + "");
        }
        return replacePMAM(value);
    }

    private static String replacePMAM(String date) {

        return date.replace("AM", "").replace("PM", "");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date = scanner.next();

        System.out.println(convert(date));
    }
}
