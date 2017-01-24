package br.com.tsouto.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by souto on 24/01/2017.
 */
public class SolutionTest {


    private int[][] getMultiArray() {
        return new int[][]{
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
    }

    @Test
    public void calculateModule() {
        int[][] multi = getMultiArray();;
        int sum = Solution.getSum(3, multi);

        assertEquals(15, sum);
    }


}