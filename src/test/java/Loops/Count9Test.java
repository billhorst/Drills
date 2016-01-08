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
public class Count9Test {

    public Count9Test() {
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
    public void c1291() {
        Count9 c9 = new Count9();
        int[] c = {1, 2, 9};
        assertEquals(1, c9.Count9(c));
    }

    @Test
    public void c1992() {
        Count9 c9 = new Count9();
        int[] c = {1, 9, 9};
        assertEquals(2, c9.Count9(c));
    }

    @Test
    public void c199393() {
        Count9 c9 = new Count9();
        int[] c = {1, 9, 9, 3, 9};
        assertEquals(3, c9.Count9(c));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
