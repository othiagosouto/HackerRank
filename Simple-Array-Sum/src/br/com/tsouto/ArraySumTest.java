package br.com.tsouto;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by souto on 21/01/2017.
 */
public class ArraySumTest {

    @Test
    public void checkUserInputArraySize() {
        int arraySize = 6;
        Solution.ArraySum arraySum = new  Solution.ArraySum(arraySize);
        int size = arraySum.getArraySize();
        assertEquals(arraySize, size);
    }

    @Test
    public void checkUserInputSum() {
        int arraySize = 6;
        int sumExpected = 30;
        Solution.ArraySum arraySum = new  Solution.ArraySum(arraySize);
        arraySum.sum(5);
        arraySum.sum(5);
        arraySum.sum(5);
        arraySum.sum(5);
        arraySum.sum(5);
        arraySum.sum(5);
        int sum = arraySum.getSum();

        assertEquals(sumExpected, sum);
    }
}