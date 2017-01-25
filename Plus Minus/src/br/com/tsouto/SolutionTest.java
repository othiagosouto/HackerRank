package br.com.tsouto;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by souto on 24/01/2017.
 */
public class SolutionTest {


    private BigDecimal secondValue;

    @Test
    public void testFraction(){

        BigDecimal firstValue = new BigDecimal(0.500000);
        firstValue = firstValue.setScale(6, BigDecimal.ROUND_HALF_UP);

        secondValue = new BigDecimal(0.333333);
        secondValue = secondValue.setScale(6, BigDecimal.ROUND_HALF_UP);
        BigDecimal thirdValue = new BigDecimal(0.166667);
        thirdValue = thirdValue.setScale(6, BigDecimal.ROUND_HALF_UP);


        assertEquals(Solution.calculateFraction(6, 3), firstValue);
        assertEquals(Solution.calculateFraction(6, 2), secondValue);
        assertEquals(Solution.calculateFraction(6, 1), thirdValue);
    }
}