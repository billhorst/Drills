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
public class CommonEndTest {

    public CommonEndTest() {
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
    public void t12373() {
        CommonEnd c = new CommonEnd();
        int[] arraya = {1, 2, 3};
        int[] arrayb = {7, 3};
        boolean result = c.commonEnd(arraya, arrayb);
        assertTrue(result);
    }

    @Test
    public void f123732() {
        CommonEnd c = new CommonEnd();
        int[] arraya = {1, 2, 3};
        int[] arrayb = {7, 3, 2};
        boolean result = c.commonEnd(arraya, arrayb);
        assertFalse(result);
    }

    @Test
    public void t12313() {
        CommonEnd c = new CommonEnd();
        int[] arraya = {1, 2, 3};
        int[] arrayb = {1, 3};
        boolean result = c.commonEnd(arraya, arrayb);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
