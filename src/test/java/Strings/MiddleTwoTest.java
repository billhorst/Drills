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
public class MiddleTwoTest {
    
    public MiddleTwoTest() {
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
    public void stringri() {
        MiddleTwo m = new MiddleTwo();
        String result = m.MiddleTwo("String");
        assertEquals("ri", result);
    }
    
    @Test
    public void codeod() {
        MiddleTwo m = new MiddleTwo();
        String result = m.MiddleTwo("Code");
        assertEquals("od", result);
    }
    
    @Test
    public void practicect() {
        MiddleTwo m = new MiddleTwo();
        String result = m.MiddleTwo("Practice");
        assertEquals("ct", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
