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
public class CaughtSpeedingTest {
    
    public CaughtSpeedingTest() {
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
    public void false60() {
        CaughtSpeeding cs = new CaughtSpeeding();
        int result = cs.CaughtSpeeding(60, false);
        assertEquals(0, result);
    }
    
    @Test
    public void false65() {
        CaughtSpeeding cs = new CaughtSpeeding();
        int result = cs.CaughtSpeeding(65, false);
        assertEquals(1, result);
    }
    
    @Test
    public void true65() {
        CaughtSpeeding cs = new CaughtSpeeding();
        int result = cs.CaughtSpeeding(65, true);
        assertEquals(0, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
