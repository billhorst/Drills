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
public class StartHiTest {

    public StartHiTest() {
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
    public void hithere() {
        StartHi s = new StartHi();
        boolean result = s.StartHi("hi there");
        assertTrue(result);
    }

    @Test
    public void hi() {
        StartHi s = new StartHi();
        boolean result = s.StartHi("hi");
        assertTrue(result);
    }

    @Test
    public void highup() {
        StartHi s = new StartHi();
        boolean result = s.StartHi("high up");
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
