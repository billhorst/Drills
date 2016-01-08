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
public class CountXXTest {

    public CountXXTest() {
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
    public void abcxx() {
        CountXX c = new CountXX();
        int result = c.CountXX("abcxx");
        assertEquals(1, result);
    }

    @Test
    public void xxx() {
        CountXX c = new CountXX();
        int result = c.CountXX("xxx");
        assertEquals(2, result);
    }

    @Test
    public void xxxx() {
        CountXX c = new CountXX();
        int result = c.CountXX("xxxx");
        assertEquals(3, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
