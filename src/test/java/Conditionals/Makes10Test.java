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
public class Makes10Test {
    
    public Makes10Test() {
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
    public void m910t() {
        Makes10 m = new Makes10();
        boolean result = m.Makes10(9, 10);
        assertTrue(result);
    }
    
    @Test
    public void m99f() {
        Makes10 m = new Makes10();
        boolean result = m.Makes10(9, 9);
        assertFalse(result);
    }
    
    @Test
    public void m91t() {
        Makes10 m = new Makes10();
        boolean result = m.Makes10(9, 1);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
