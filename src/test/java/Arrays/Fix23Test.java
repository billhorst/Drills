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
public class Fix23Test {
    
    public Fix23Test() {
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
        Fix23 f = new Fix23();
        int[] a = {1,2,3};
        int[] exp = {1,2,0};
        assertArrayEquals(exp,f.Fix23(a));
    }
    
    @Test
    public void t235() {
        Fix23 f = new Fix23();
        int[] a = {2,3,5};
        int[] exp = {2,0,5};
        assertArrayEquals(exp,f.Fix23(a));
    }
    
    @Test
    public void t121() {
        Fix23 f = new Fix23();
        int[] a = {1,2,1};
        int[] exp = {1,2,1};
        assertArrayEquals(exp,f.Fix23(a));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
