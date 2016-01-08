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
public class SpecialElevenTest {
    
    public SpecialElevenTest() {
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
    public void se22t() {
        SpecialEleven se = new SpecialEleven();
        boolean result = se.SpecialEleven(22);
        assertTrue(result);
    }
    
    @Test
    public void se23t() {
        SpecialEleven se = new SpecialEleven();
        boolean result = se.SpecialEleven(23);
        assertTrue(result);
    }
    
    @Test
    public void se24f() {
        SpecialEleven se = new SpecialEleven();
        boolean result = se.SpecialEleven(24);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
