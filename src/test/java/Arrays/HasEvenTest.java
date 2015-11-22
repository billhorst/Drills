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
public class HasEvenTest {
    
    public HasEvenTest() {
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
    public void t25() {
        HasEven h = new HasEven();
        int[] a = {2,5};
        assertTrue(h.HasEven(a));
    }

    @Test
    public void t43() {
        HasEven h = new HasEven();
        int[] a = {4,3};
        assertTrue(h.HasEven(a));
    }
    
    @Test
    public void f75() {
        HasEven h = new HasEven();
        int[] a = {7,5};
        assertFalse(h.HasEven(a));
    }    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
