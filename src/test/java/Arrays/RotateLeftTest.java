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
    public void t123231() {
        RotateLeft r = new RotateLeft();
        int[] a = {1, 2, 3};
        int[] result = r.RotateLeft(a);
        assertEquals(result, a);
    }

    @Test
    public void t5119() {
        RotateLeft r = new RotateLeft();
        int[] a = {5, 11, 9};
        int[] result = r.RotateLeft(a);
        assertEquals(result, a);
    }

    @Test
    public void t700() {
        RotateLeft r = new RotateLeft();
        int[] a = {7, 0, 0};
        int[] result = r.RotateLeft(a);
        assertEquals(result, a);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
