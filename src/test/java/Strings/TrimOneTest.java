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
public class TrimOneTest {

    public TrimOneTest() {
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
    public void hello() {
        TrimOne to = new TrimOne();
        String result = to.TrimOne("Hello");
        assertEquals("ell", result);
    }

    @Test
    public void java() {
        TrimOne to = new TrimOne();
        String result = to.TrimOne("Java");
        assertEquals("av", result);
    }

    @Test
    public void coding() {
        TrimOne to = new TrimOne();
        String result = to.TrimOne("Coding");
        assertEquals("odin", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
