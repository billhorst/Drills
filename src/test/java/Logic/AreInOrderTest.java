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
public class AreInOrderTest {
    
    public AreInOrderTest() {
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
    public void ft124() {
        AreInOrder a = new AreInOrder();
        boolean result = a.AreInOrder(1, 2, 4, false);
        assertTrue(result);
    }
    
    @Test
    public void ff121() {
        AreInOrder a = new AreInOrder();
        boolean result = a.AreInOrder(1, 2, 1, false);
        assertFalse(result);
    }
    
    @Test
    public void tt112() {
        AreInOrder a = new AreInOrder();
        boolean result = a.AreInOrder(1, 1, 2, true);
        assertTrue(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
