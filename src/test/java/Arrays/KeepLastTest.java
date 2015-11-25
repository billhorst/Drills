/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

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
public class KeepLastTest {

    public KeepLastTest() {
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
    public void t456() {
        KeepLast k = new KeepLast();
        int[] a = {4, 5, 6};
        int[] exp = {0, 0, 0, 0, 0, 6};
        assertArrayEquals(exp, k.KeepLast(a));
    }

    @Test
    public void t12() {
        KeepLast k = new KeepLast();
        int[] a = {1, 2};
        int[] exp = {0, 0, 0, 2};
        assertArrayEquals(exp, k.KeepLast(a));
    }

    @Test
    public void t3() {
        KeepLast k = new KeepLast();
        int[] a = {3};
        int[] exp = {0, 3};
        assertArrayEquals(exp, k.KeepLast(a));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
