package br.com.tsouto;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by souto on 21/01/2017.
 */
public class BoxerTest {


    @Test
    public void equalsValues() {
        int aX = 10;
        int bX = 10;

        assertEquals(Solution.Boxer.compareValues(aX, bX), Solution.Boxer.EQUALS_VALUE);
    }

    @Test
    public void aXBigger() {
        int aX = 10;
        int bX = 5;

        assertEquals(Solution.Boxer.compareValues(aX, bX), Solution.Boxer.AX_BIGGER);

    }

    @Test
    public void bXBigger() {
        int aX = 5;
        int bX = 10;

        assertEquals(Solution.Boxer.compareValues(aX, bX), Solution.Boxer.BX_BIGGER);

    }

    @Test
    public void testIncrement() {
        int aX = 20;
        int bX = 10;
        Solution.Boxer boxer = new Solution.Boxer();

        boxer.increment(aX, bX);
        assertEquals(boxer.getASum(), 1);
        assertEquals(boxer.getBSum(),0);
    }
}