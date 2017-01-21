package br.com.tsouto;

import java.util.Scanner;

public class Solution {


    public static class Boxer {
        private int aSum = 0;
        private int bSum = 0;

        public void increment(int aX, int bX) {
            int compareResult = compareValues(aX, bX);

            if (compareResult == AX_BIGGER) {
                aSum += 1;
            } else if (compareResult == BX_BIGGER) {
                bSum += 1;
            }

        }

        public int getASum() {
            return aSum;
        }

        public int getBSum() {
            return bSum;
        }

        private static final int NOT_INITIALIZED = -5;
        public static int EQUALS_VALUE = 0;
        public static int AX_BIGGER = -1;
        public static int BX_BIGGER = 1;


        public static int compareValues(int aX, int bX) {
            int value = NOT_INITIALIZED;
            if (aX == bX) {
                value = EQUALS_VALUE;
            } else if (aX > bX) {
                value = AX_BIGGER;
            } else if (bX > aX) {
                value = BX_BIGGER;
            }
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();


        Boxer boxer = new Boxer();

        boxer.increment(a0,b0);
        boxer.increment(a1,b1);
        boxer.increment(a2,b2);

        String result = boxer.getASum() + " " + boxer.getBSum();
        System.out.println(result);

    }

}
