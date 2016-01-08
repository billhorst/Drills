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
public class Between10And20Test {

    public Between10And20Test() {
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
    public void t1299() {
        Between10And20 b = new Between10And20();
        boolean result = b.Between10And20(12, 99);
        assertTrue(result);
    }

    @Test
    public void t2112() {
        Between10And20 b = new Between10And20();
        boolean result = b.Between10And20(21, 12);
        assertTrue(result);
    }

    @Test
    public void f899() {
        Between10And20 b = new Between10And20();
        boolean result = b.Between10And20(8, 99);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
