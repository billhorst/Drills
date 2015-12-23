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
public class FrontThreeTest {
    
    public FrontThreeTest() {
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
    public void microsoft() {
        FrontThree f = new FrontThree();
        String result = f.Front3("Microsoft");
        assertEquals("MicMicMic", result);
    }
    
    @Test
    public void Chocolate() {
        FrontThree f = new FrontThree();
        String result = f.Front3("Chocolate");
        assertEquals("ChoChoCho", result);
    }
    
    @Test
    public void at() {
        FrontThree f = new FrontThree();
        String result = f.Front3("at");
        assertEquals("atatat", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
