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
public class HasTeenTest {
    
    public HasTeenTest() {
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
    public void t132010() {
        HasTeen h = new HasTeen();
        boolean result = h.HasTeen(13, 20, 10);
        assertTrue(result);
    }
    
    @Test
    public void t201910() {
        HasTeen h = new HasTeen();
        boolean result = h.HasTeen(20, 19, 10);
        assertTrue(result);
    }
    
    @Test
    public void t201012() {
        HasTeen h = new HasTeen();
        boolean result = h.HasTeen(20, 10, 12);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
