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
public class StringTimesTest {

    public StringTimesTest() {
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
    public void Hi3HIHI() {
        StringTimes s = new StringTimes();
        String result = s.StringTimes("Hi", 3);
        assertEquals("HiHiHi", result);
    }

    @Test
    public void Hi2HIHI() {
        StringTimes s = new StringTimes();
        String result = s.StringTimes("Hi", 2);
        assertEquals("HiHi", result);
    }

    @Test
    public void Hi1HI() {
        StringTimes s = new StringTimes();
        String result = s.StringTimes("Hi", 1);
        assertEquals("Hi", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
