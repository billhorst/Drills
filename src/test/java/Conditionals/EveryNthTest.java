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
public class EveryNthTest {

    public EveryNthTest() {
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
    public void miracle2() {
        EveryNth e = new EveryNth();
        String result = e.EveryNth("Miracle", 2);
        assertEquals("Mrce", result);
    }

    @Test
    public void abcdefg2() {
        EveryNth e = new EveryNth();
        String result = e.EveryNth("abcdefg", 2);
        assertEquals("aceg", result);
    }

    @Test
    public void miracle3() {
        EveryNth e = new EveryNth();
        String result = e.EveryNth("abcdefg", 3);
        assertEquals("adg", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
