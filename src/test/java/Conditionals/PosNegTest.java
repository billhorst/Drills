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
public class PosNegTest {
    
    public PosNegTest() {
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
    public void f1n1t() {
        PosNeg p = new PosNeg();
        boolean result = p.PosNeg(1, -1, false);
        assertTrue(result);
    }
    
    @Test
    public void fn11t() {
        PosNeg p = new PosNeg();
        boolean result = p.PosNeg(-1, 1, false);
        assertTrue(result);
    }
    
    @Test
    public void tn41n5t() {
        PosNeg p = new PosNeg();
        boolean result = p.PosNeg(-4, -5, true);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
