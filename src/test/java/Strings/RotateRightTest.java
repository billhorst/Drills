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
public class RotateRightTest {

    public RotateRightTest() {
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
    public void rrhello() {
        RotateRight r = new RotateRight();
        String result = r.RotateRight("Hello");
        assertEquals("loHel", result);
    }

    @Test
    public void rrjava() {
        RotateRight r = new RotateRight();
        String result = r.RotateRight("java");
        assertEquals("vaja", result);
    }

    @Test
    public void rrhi() {
        RotateRight r = new RotateRight();
        String result = r.RotateRight("Hi");
        assertEquals("Hi", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
