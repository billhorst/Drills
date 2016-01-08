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
public class SameFirstLastTest {

    public SameFirstLastTest() {
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
    public void sfl123() {
        SameFirstLast sfl = new SameFirstLast();
        int[] array = {1, 2, 3};
        boolean result = sfl.SameFirstLast(array);
        assertFalse(result);
    }

    @Test
    public void sf1231() {
        SameFirstLast sfl = new SameFirstLast();
        int[] array = {1, 2, 3, 1};
        boolean result = sfl.SameFirstLast(array);
        assertTrue(result);
    }

    @Test
    public void sf121() {
        SameFirstLast sfl = new SameFirstLast();
        int[] array = {1, 2, 1};
        boolean result = sfl.SameFirstLast(array);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
