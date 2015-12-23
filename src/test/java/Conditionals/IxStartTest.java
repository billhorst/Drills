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
public class IxStartTest {
    
    public IxStartTest() {
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
    public void mix() {
        IxStart i = new IxStart();
        boolean result = i.IxStart("mix");
        assertTrue(result);
    }
    
    @Test
    public void pix() {
        IxStart i = new IxStart();
        boolean result = i.IxStart("pix");
        assertTrue(result);
    }
    
    @Test
    public void piz() {
        IxStart i = new IxStart();
        boolean result = i.IxStart("piz");
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
