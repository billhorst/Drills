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
public class GreatPartyTest {
    
    public GreatPartyTest() {
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
    public void weekend39() {
        GreatParty gp = new GreatParty();
        boolean result = gp.GreatParty(39, true);
        assertFalse(result);
    }
    
    @Test
    public void weekend40() {
        GreatParty gp = new GreatParty();
        boolean result = gp.GreatParty(40, true);
        assertTrue(result);
    }
    
    @Test
    public void weekend80() {
        GreatParty gp = new GreatParty();
        boolean result = gp.GreatParty(80, true);
        assertTrue(result);
    }
    
    @Test
    public void weekday39() {
        GreatParty gp = new GreatParty();
        boolean result = gp.GreatParty(39, false);
        assertFalse(result);
    }
    
    @Test
    public void weekday40() {
        GreatParty gp = new GreatParty();
        boolean result = gp.GreatParty(40, false);
        assertTrue(result);
    }
    
    @Test
    public void weekday61() {
        GreatParty gp = new GreatParty();
        boolean result = gp.GreatParty(61, false);
        assertFalse(result);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
