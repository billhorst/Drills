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
public class FirstLast6Test {

    public FirstLast6Test() {
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
    public void fl126() {
        FirstLast6 fl = new FirstLast6();
        int[] array = {1, 2, 6};
        boolean result = fl.FirstLast6(array);
        assertTrue(result);
    }

    @Test
    public void fl6123() {
        FirstLast6 fl = new FirstLast6();
        int[] array = {6, 1, 2, 3};
        boolean result = fl.FirstLast6(array);
        assertTrue(result);
    }

    @Test
    public void fl13_6123() {
        FirstLast6 fl = new FirstLast6();
        int[] array = {13, 6, 1, 2, 3};
        boolean result = fl.FirstLast6(array);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
