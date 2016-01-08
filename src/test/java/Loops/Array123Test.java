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
public class Array123Test {

    public Array123Test() {
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
    public void array11231t() {
        Array123 a = new Array123();
        int[] array = {1, 1, 2, 3, 1};
        assertTrue(a.Array123(array));
    }

    @Test
    public void array11241f() {
        Array123 a = new Array123();
        int[] array = {1, 1, 2, 3, 1};
        assertTrue(a.Array123(array));
    }

    @Test
    public void array112123t() {
        Array123 a = new Array123();
        int[] array = {1, 1, 2, 3, 1};
        assertTrue(a.Array123(array));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
