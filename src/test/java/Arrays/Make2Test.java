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
public class Make2Test {

    public Make2Test() {
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
    public void a45123() {
        Make2 m = new Make2();
        int[] a = {4, 5};
        int[] b = {1, 2, 3};
        int[] exp = {4, 5};
        assertArrayEquals(exp, m.make2(a, b));
    }

    @Test
    public void a4123() {
        Make2 m = new Make2();
        int[] a = {4};
        int[] b = {1, 2, 3};
        int[] exp = {4, 1};
        assertArrayEquals(exp, m.make2(a, b));
    }

    @Test
    public void a12() {
        Make2 m = new Make2();
        int[] a = {};
        int[] b = {1, 2};
        int[] exp = {1, 2};
        assertArrayEquals(exp, m.make2(a, b));
    }

    @Test
    public void a121() {
        Make2 m = new Make2();
        int[] a = {};
        int[] b = {1, 2, 1};
        int[] exp = {1, 2};
        assertArrayEquals(exp, m.make2(a, b));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
