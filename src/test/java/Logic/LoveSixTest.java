/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

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
public class LoveSixTest {
    
    public LoveSixTest() {
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
    public void ls64t() {
        LoveSix ls = new LoveSix();
        boolean result = ls.LoveSix(6, 4);
        assertTrue(result);
    }
    
    @Test
    public void ls45f() {
        LoveSix ls = new LoveSix();
        boolean result = ls.LoveSix(4, 5);
        assertFalse(result);
    }
    
    @Test
    public void ls15t() {
        LoveSix ls = new LoveSix();
        boolean result = ls.LoveSix(1, 5);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
