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
public class StringXTest {

    public StringXTest() {
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
    public void xxHxixxHix() {
        StringX s = new StringX();
        String result = s.StringX("xxHxix");
        assertEquals("xHix", result);
    }

    @Test
    public void abxxxcdabcd() {
        StringX s = new StringX();
        String result = s.StringX("abxxxcd");
        assertEquals("abcd", result);
    }

    @Test
    public void xabxxxcdxxabcdx() {
        StringX s = new StringX();
        String result = s.StringX("xabxxxcdx");
        assertEquals("xabcdx", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
