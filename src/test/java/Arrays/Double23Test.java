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
public class Double23Test {
    
    public Double23Test() {
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
    public void t223() {
        Double23 d = new Double23();
        int[] a = {2,2,3};
        assertTrue(d.Double23(a));
    }
    
    @Test
    public void t3453() {
        Double23 d = new Double23();
        int[] a = {3,4,5,3};
        assertTrue(d.Double23(a));
    }
    
    @Test
    public void f2322() {
        Double23 d = new Double23();
        int[] a = {2,3,2,2};
        assertFalse(d.Double23(a));
    }    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
