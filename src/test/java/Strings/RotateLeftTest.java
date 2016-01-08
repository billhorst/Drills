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
public class RotateLeftTest {

    public RotateLeftTest() {
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
    public void rlhello() {
        RotateLeft r = new RotateLeft();
        String result = r.RotateLeft("Hello");
        assertEquals("lloHe", result);
    }

    @Test
    public void rljava() {
        RotateLeft r = new RotateLeft();
        String result = r.RotateLeft("Java");
        assertEquals("vaJa", result);
    }

    @Test
    public void rrhi() {
        RotateLeft r = new RotateLeft();
        String result = r.RotateLeft("Hi");
        assertEquals("Hi", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
