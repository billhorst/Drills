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
public class MultipleEndingsTest {

    public MultipleEndingsTest() {
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
    public void hehawawaw() {
        MultipleEndings me = new MultipleEndings();
        String result = me.MultipleEndings("Hehaw");
        assertEquals("awawaw", result);
    }

    @Test
    public void hellololo() {
        MultipleEndings me = new MultipleEndings();
        String result = me.MultipleEndings("Hello");
        assertEquals("lololo", result);
    }

    @Test
    public void hi() {
        MultipleEndings me = new MultipleEndings();
        String result = me.MultipleEndings("Hi");
        assertEquals("HiHiHi", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
