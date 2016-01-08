/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

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
public class AltPairsTest {
    
    public AltPairsTest() {
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
    public void kittenkien() {
        AltPairs a = new AltPairs();
        String result = a.AltPairs("kitten");
        assertEquals("kien", result);
    }
    
    @Test
    public void chocolatechole() {
        AltPairs a = new AltPairs();
        String result = a.AltPairs("chocolate");
        assertEquals("chole", result);
    }
    
    @Test
    public void codinghorrorcongrr() {
        AltPairs a = new AltPairs();
        String result = a.AltPairs("codinghorror");
        assertEquals("congrr", result);
    }
    
    @Test
    public void codinghorrorshow() {
        AltPairs a = new AltPairs();
        String result = a.AltPairs("codinghorrorshow");
        assertEquals("congrrsh", result);
    }
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
