/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

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
public class SkipSumTest {
    
    public SkipSumTest() {
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
    public void skipSum34() {
        SkipSum ss = new SkipSum();
        int result = ss.SkipSum(3, 4);
        assertEquals(7, result);
    }
    
    @Test
    public void skipSum94() {
        SkipSum ss = new SkipSum();
        int result = ss.SkipSum(9, 4);
        assertEquals(20, result);
    }
    
    @Test
    public void skipSum1011() {
        SkipSum ss = new SkipSum();
        int result = ss.SkipSum(10, 11);
        assertEquals(21, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
