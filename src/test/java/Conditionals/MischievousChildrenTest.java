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
public class MischievousChildrenTest {
    
    public MischievousChildrenTest() {
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
    public void ttt() {
        MischievousChildren m = new MischievousChildren();
        boolean result = m.AreWeInTrouble(true, true);
        assertTrue(result);
    }
    
    @Test
    public void fft() {
        MischievousChildren m = new MischievousChildren();
        boolean result = m.AreWeInTrouble(false, false);
        assertTrue(result);
    }
    
    @Test
    public void tff() {
        MischievousChildren m = new MischievousChildren();
        boolean result = m.AreWeInTrouble(true, false);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
