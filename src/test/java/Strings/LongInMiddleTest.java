/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

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
public class LongInMiddleTest {

    public LongInMiddleTest() {
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
    public void helloHi() {
        LongInMiddle lim = new LongInMiddle();
        String result = lim.LongInMiddle("Hello", "hi");
        assertEquals("hiHellohi", result);
    }

    @Test
    public void hiHello() {
        LongInMiddle lim = new LongInMiddle();
        String result = lim.LongInMiddle("hi", "Hello");
        assertEquals("hiHellohi", result);
    }

    @Test
    public void aaab() {
        LongInMiddle lim = new LongInMiddle();
        String result = lim.LongInMiddle("aaa", "b");
        assertEquals("baaab", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
