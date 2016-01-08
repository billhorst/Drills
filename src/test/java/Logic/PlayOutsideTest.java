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
public class PlayOutsideTest {
    
    public PlayOutsideTest() {
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
    public void false70() {
        PlayOutside po = new PlayOutside();
        boolean result = po.PlayOutside(70, false);
        assertTrue(result);
    }
    
    @Test
    public void false95() {
        PlayOutside po = new PlayOutside();
        boolean result = po.PlayOutside(95, false);
        assertFalse(result);
    }
    
    @Test
    public void true95() {
        PlayOutside po = new PlayOutside();
        boolean result = po.PlayOutside(95, true);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
