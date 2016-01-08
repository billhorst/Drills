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
public class SleepingInTest {

    public SleepingInTest() {
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
    public void fft() {
        SleepingIn s = new SleepingIn();
        boolean result = s.SleepingIn(false, false);
        assertTrue(result);
    }

    @Test
    public void tff() {
        SleepingIn s = new SleepingIn();
        boolean result = s.SleepingIn(true, false);
        assertFalse(result);
    }

    @Test
    public void ftt() {
        SleepingIn s = new SleepingIn();
        boolean result = s.SleepingIn(false, true);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
