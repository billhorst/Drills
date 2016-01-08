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
public class MaxTest {

    public MaxTest() {
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
    public void m123() {
        Max m = new Max();
        int result = m.Max(1, 2, 3);
        assertEquals(3, result);
    }

    @Test
    public void m132() {
        Max m = new Max();
        int result = m.Max(1, 3, 2);
        assertEquals(3, result);
    }

    @Test
    public void m321() {
        Max m = new Max();
        int result = m.Max(3, 2, 1);
        assertEquals(3, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
