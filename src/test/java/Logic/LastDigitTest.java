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
public class LastDigitTest {
    
    public LastDigitTest() {
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
    public void ld231913t() {
        LastDigit l = new LastDigit();
        boolean result = l.LastDigit(23, 19, 13);
        assertTrue(result);
    }
    
    @Test
    public void ld231912f() {
        LastDigit l = new LastDigit();
        boolean result = l.LastDigit(23, 19, 12);
        assertFalse(result);
    }
    
    @Test
    public void ld23193t() {
        LastDigit l = new LastDigit();
        boolean result = l.LastDigit(23, 19, 3);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
