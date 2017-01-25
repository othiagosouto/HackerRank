package br.com.tsouto;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by souto on 24/01/2017.
 */
public class SolutionTest {

    @Test
    public void testLine() {
        List<String> list = new ArrayList<>();
        list.add("     #");
        list.add("    ##");
        list.add("   ###");
        list.add("  ####");
        list.add(" #####");
        list.add("######");


        for (int i = 1; i <= 6; i++) {
            assertEquals(Solution.createLine(i, 6), list.get(i - 1));
        }

    }
}