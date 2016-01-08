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
public class FirstHalfTest {

    public FirstHalfTest() {
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
    public void woohoo() {
        FirstHalf fh = new FirstHalf();
        String result = fh.FirstHalf("WooHoo");
        assertEquals("Woo", result);
    }

    @Test
    public void helloThere() {
        FirstHalf fh = new FirstHalf();
        String result = fh.FirstHalf("HelloThere");
        assertEquals("Hello", result);
    }

    @Test
    public void abcdef() {
        FirstHalf fh = new FirstHalf();
        String result = fh.FirstHalf("abcdef");
        assertEquals("abc", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
