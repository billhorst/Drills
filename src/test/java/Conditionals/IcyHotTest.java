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
public class IcyHotTest {
    
    public IcyHotTest() {
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
    public void i120n1() {
        IcyHot i = new IcyHot();
        boolean result = i.IcyHot(120, -1);
        assertTrue(result);
    }

    @Test
    public void in1p120() {
        IcyHot i = new IcyHot();
        boolean result = i.IcyHot(-1, 120);
        assertTrue(result);
    }

    @Test
    public void i2p120() {
        IcyHot i = new IcyHot();
        boolean result = i.IcyHot(2, 120);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
