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
public class Mod35Test {
    
    public Mod35Test() {
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
    public void m3t() {
        Mod35 m = new Mod35();
        boolean result = m.Mod35(3);
        assertTrue(result);
    }
    
    @Test
    public void m10t() {
        Mod35 m = new Mod35();
        boolean result = m.Mod35(10);
        assertTrue(result);
    }
    
    @Test
    public void m15f() {
        Mod35 m = new Mod35();
        boolean result = m.Mod35(15);
        assertFalse(result);
    }
    
    @Test
    public void m17f() {
        Mod35 m = new Mod35();
        boolean result = m.Mod35(17);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
