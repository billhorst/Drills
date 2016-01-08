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
public class InOrderEqualTest {
    
    public InOrderEqualTest() {
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
    public void ioe2511ft() {
        InOrderEqual i = new InOrderEqual();
        boolean result = i.InOrderEqual(2, 5, 11, false);
        assertTrue(result);
    }
    
    @Test
    public void ioe576ff() {
        InOrderEqual i = new InOrderEqual();
        boolean result = i.InOrderEqual(5, 7, 6, false);
        assertFalse(result);
    }
    
    @Test
    public void ioe557tt() {
        InOrderEqual i = new InOrderEqual();
        boolean result = i.InOrderEqual(5, 5, 7, true);
        assertTrue(result);
    }
    
    @Test
    public void ioe2511tt() {
        InOrderEqual i = new InOrderEqual();
        boolean result = i.InOrderEqual(2, 5, 11, true);
        assertTrue(result);
    }
    
    @Test
    public void ioe577tt() {
        InOrderEqual i = new InOrderEqual();
        boolean result = i.InOrderEqual(5, 5, 7, true);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
