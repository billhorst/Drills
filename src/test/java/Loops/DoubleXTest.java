/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

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
public class DoubleXTest {

    public DoubleXTest() {
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
    public void axxbbt() {
        DoubleX d = new DoubleX();
        boolean result = d.DoubleX("axxbb");
        assertTrue(result);
    }

    @Test
    public void axaxxaxf() {
        DoubleX d = new DoubleX();
        boolean result = d.DoubleX("axaxxax");
        assertFalse(result);
    }

    @Test
    public void xxxxt() {
        DoubleX d = new DoubleX();
        boolean result = d.DoubleX("xxxx");
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
