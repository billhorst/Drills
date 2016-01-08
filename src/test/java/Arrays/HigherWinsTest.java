/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bill
 */
public class HigherWinsTest {

    public HigherWinsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void t123() {
        HigherWins h = new HigherWins();
        int[] a = {1, 2, 3};
        int[] result = {3, 3, 3};
        int[] done = h.HigherWins(a);
        assertArrayEquals(result, done);
    }

    @Test
    public void t5119() {
        HigherWins h = new HigherWins();
        int[] a = {11, 5, 9};
        int[] b = {11, 11, 11};
        assertArrayEquals(b, h.HigherWins(a));
    }

    @Test
    public void t2113() {
        HigherWins h = new HigherWins();
        int[] orig = {2, 11, 3};
        int[] expected = {3, 3, 3};
        assertArrayEquals(expected, h.HigherWins(orig));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
