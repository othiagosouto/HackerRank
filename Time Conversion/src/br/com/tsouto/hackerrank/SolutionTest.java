package br.com.tsouto.hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by souto on 28/01/2017.
 */
public class SolutionTest {


    @Test
    public void testAMConversion() {
        String entry = "07:05:45AM";
        String expected = "07:05:45";
        assertEquals(expected, Solution.convert(entry));
    }

    @Test
    public void testAMConversion2() {
        String entry = "00:00:45AM";
        String expected = "00:00:45";
        assertEquals(expected, Solution.convert(entry));
    }

    @Test
    public void testAMConversion3() {
        String entry = "05:00:45AM";
        String expected = "05:00:45";
        assertEquals(expected, Solution.convert(entry));
    }

    @Test
    public void testPMConversion() {
        String entry = "07:05:45PM";
        String expected = "19:05:45";
        assertEquals(expected, Solution.convert(entry));
    }

    @Test
    public void testPMConversion2() {
        String entry = "12:59:59PM";
        String expected = "12:59:59";
        assertEquals(expected, Solution.convert(entry));
    }


}