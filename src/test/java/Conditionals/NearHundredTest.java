/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

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
public class NearHundredTest {
    
    public NearHundredTest() {
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
    public void t103() {
        NearHundred n = new NearHundred();
        boolean result = n.NearHundred(103);
        assertTrue(result);
    }
    
    @Test
    public void t90() {
        NearHundred n = new NearHundred();
        boolean result = n.NearHundred(90);
        assertTrue(result);
    }
    
    @Test
    public void f89() {
        NearHundred n = new NearHundred();
        boolean result = n.NearHundred(89);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
