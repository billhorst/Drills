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
public class SoAloneTest {
    
    public SoAloneTest() {
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
    public void t1399() {
        SoAlone s = new SoAlone();
        boolean result = s.SoAlone(13, 99);
        assertTrue(result);
    }
    
    @Test
    public void t2119() {
        SoAlone s = new SoAlone();
        boolean result = s.SoAlone(21, 19);
        assertTrue(result);
    }
    
    @Test
    public void f1313() {
        SoAlone s = new SoAlone();
        boolean result = s.SoAlone(13, 13);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
