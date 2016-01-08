/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

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
public class CloserTest {

    public CloserTest() {
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
    public void c813() {
        Closer c = new Closer();
        int result = c.Closer(8, 13);
        assertEquals(8, result);
    }

    @Test
    public void c137() {
        Closer c = new Closer();
        int result = c.Closer(13, 7);
        assertEquals(0, result);
    }

    @Test
    public void c138() {
        Closer c = new Closer();
        int result = c.Closer(13, 8);
        assertEquals(8, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
