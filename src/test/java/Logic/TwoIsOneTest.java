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
public class TwoIsOneTest {
    
    public TwoIsOneTest() {
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
    public void tio123t() {
        TwoIsOne t = new TwoIsOne();
        boolean result = t.TwoIsOne(1, 2, 3);
        assertTrue(result);
    }
    
    @Test
    public void tio312t() {
        TwoIsOne t = new TwoIsOne();
        boolean result = t.TwoIsOne(3, 1, 2);
        assertTrue(result);
    }
    
    @Test
    public void tio322t() {
        TwoIsOne t = new TwoIsOne();
        boolean result = t.TwoIsOne(3, 2, 2);
        assertFalse(result);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
