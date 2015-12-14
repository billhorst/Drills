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
public class UnluckyTest {
    
    public UnluckyTest() {
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
    public void t1345() {
        Unlucky u = new Unlucky();
        int[] a = {1,3,4,5};
        assertTrue(u.Unlucky1(a));
    }
    
    @Test
    public void t21345() {
        Unlucky u = new Unlucky();
        int[] a = {2,1,3,4,5};
        assertTrue(u.Unlucky1(a));
    }
    
    @Test
    public void f111() {
        Unlucky u = new Unlucky();
        int[] a = {1,1,1};
        assertFalse(u.Unlucky1(a));
    }
    
    @Test
    public void f22213333() {
        Unlucky u = new Unlucky();
        int[] a = {2,2,2,1,3,3,3};
        assertFalse(u.Unlucky1(a));
    }
    @Test
    public void t222213() {
        Unlucky u = new Unlucky();
        int[] a = {2,2,2,2,1,3};
        assertTrue(u.Unlucky1(a));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
