package br.com.tsouto;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        ArraySum arraySum = new ArraySum(arraySize);

        for (int i = 0; i < arraySum.getArraySize(); i++) {
            arraySum.sum(in.nextInt());
        }


        System.out.println(arraySum.getSum());
    }


    public static class ArraySum {

        private int arraySize;
        private int sum;


        public ArraySum(int size) {
            this.arraySize = size;
        }

        public void setArraySize(int size) {
            this.arraySize = size;
        }


        public int getArraySize() {
            return this.arraySize;
        }

        public int getSum() {
            return this.sum;
        }

        public void sum(int value) {
            this.sum += value;
        }
    }

}
