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
public class SumTest {

    public SumTest() {
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
    public void six123() {
        Sum s = new Sum();
        int[] a = {1, 2, 3};
        int result = s.Sum(a);
        assertEquals(result, 6);
    }

    @Test
    public void eighteen5112() {
        Sum s = new Sum();
        int[] a = {5,11,2};
        int result = s.Sum(a);
        assertEquals(result, 18);
    }

    @Test
    public void seven700() {
        Sum s = new Sum();
        int[] a = {7,0,0};
        int result = s.Sum(a);
        assertEquals(result, 7);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
