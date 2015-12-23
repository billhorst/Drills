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
public class StartOzTest {
    
    public StartOzTest() {
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
    public void ozymandias() {
        StartOz s = new StartOz();
        String result = s.StartOz("ozymandias");
        assertEquals("oz", result);
    }
    
    @Test
    public void bzoo() {
        StartOz s = new StartOz();
        String result = s.StartOz("bzoo");
        assertEquals("z", result);
    }
    
    @Test
    public void oxx() {
        StartOz s = new StartOz();
        String result = s.StartOz("oxx");
        assertEquals("o", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
