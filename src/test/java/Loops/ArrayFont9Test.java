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
public class ArrayFont9Test {

    public ArrayFont9Test() {
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
    public void a12934t() {
        ArrayFont9 a = new ArrayFont9();
        int[] array = {1, 2, 9, 3, 4};
        assertTrue(a.ArrayFont9(array));
    }

    @Test
    public void a12349f() {
        ArrayFont9 a = new ArrayFont9();
        int[] array = {1, 2, 3, 4, 9};
        assertFalse(a.ArrayFont9(array));
    }

    @Test
    public void a12345f() {
        ArrayFont9 a = new ArrayFont9();
        int[] array = {1, 2, 3, 4, 5};
        assertFalse(a.ArrayFont9(array));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
