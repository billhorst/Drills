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
public class ReverseTest {
    
    public ReverseTest() {
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
    public void t123() {
        Reverse r = new Reverse();
        int[] a = {1,2,3};
        int[] ex = {3,2,1};
        assertArrayEquals(ex, r.Reverse(a));
    }
    
    @Test
    public void t345() {
        Reverse r = new Reverse();
        int[] a = {3,4,5};
        int[] ex = {5,4,3};
        assertArrayEquals(ex, r.Reverse(a));
    }
    
    @Test
    public void t222223() {
        Reverse r = new Reverse();
        int[] a = {22,22,23};
        int[] ex = {23,22,22};
        assertArrayEquals(ex, r.Reverse(a));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
