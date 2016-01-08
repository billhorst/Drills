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
public class Mod20Test {
    
    public Mod20Test() {
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
    public void m2020f() {
        Mod20 m = new Mod20();
        boolean result = m.Mod20(20);
        assertFalse(result);
    }
    
    @Test
    public void m2021t() {
        Mod20 m = new Mod20();
        boolean result = m.Mod20(21);
        assertTrue(result);
    }
    
    @Test
    public void m2022t() {
        Mod20 m = new Mod20();
        boolean result = m.Mod20(22);
        assertTrue(result);
    }
    
    @Test
    public void m2041t() {
        Mod20 m = new Mod20();
        boolean result = m.Mod20(41);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
