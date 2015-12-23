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
public class ParrotTroubleTest {
    
    public ParrotTroubleTest() {
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
    public void t6t() {
        ParrotTrouble p = new ParrotTrouble();
        boolean result = p.ParrotTrouble(true, 6);
        assertTrue(result);
    }
    
    @Test
    public void t7f() {
        ParrotTrouble p = new ParrotTrouble();
        boolean result = p.ParrotTrouble(true, 7);
        assertFalse(result);
    }
    
    @Test
    public void f6f() {
        ParrotTrouble p = new ParrotTrouble();
        boolean result = p.ParrotTrouble(false, 6);
        assertFalse(result);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
