/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

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
public class TakeOneTest {
    
    public TakeOneTest() {
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
    public void helloth() {
        TakeOne t = new TakeOne();
        String result = t.TakeOne("Hello", true);
        assertEquals("H", result);
    }
    
    @Test
    public void hellofo() {
        TakeOne t = new TakeOne();
        String result = t.TakeOne("Hello", false);
        assertEquals("o", result);
    }
    
    @Test
    public void ohto() {
        TakeOne t = new TakeOne();
        String result = t.TakeOne("oh", true);
        assertEquals("o", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
