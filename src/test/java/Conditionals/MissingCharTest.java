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
public class MissingCharTest {
    
    public MissingCharTest() {
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
    public void kittin1() {
        MissingChar m = new MissingChar();
        String result = m.MissingChar("kitten", 1);
        assertEquals("ktten", result);
    }
    
    @Test
    public void kittin0() {
        MissingChar m = new MissingChar();
        String result = m.MissingChar("kitten", 0);
        assertEquals("itten", result);
    }
    
    @Test
    public void kittin4() {
        MissingChar m = new MissingChar();
        String result = m.MissingChar("kitten", 4);
        assertEquals("kittn", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
