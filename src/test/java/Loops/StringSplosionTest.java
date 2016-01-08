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
public class StringSplosionTest {

    public StringSplosionTest() {
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
    public void code() {
        StringSplosion s = new StringSplosion();
        String result = s.StringSplosion("Code");
        assertEquals("CCoCodCode", result);
    }

    @Test
    public void abc() {
        StringSplosion s = new StringSplosion();
        String result = s.StringSplosion("abc");
        assertEquals("aababc", result);
    }

    @Test
    public void ab() {
        StringSplosion s = new StringSplosion();
        String result = s.StringSplosion("ab");
        assertEquals("aab", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
