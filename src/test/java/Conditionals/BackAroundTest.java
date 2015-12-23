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
public class BackAroundTest {
    
    public BackAroundTest() {
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
    public void cat() {
        BackAround b = new BackAround();
        String result = b.BackAround("cat");
        assertEquals("tcatt",result);
    }
    
    @Test
    public void hello() {
        BackAround b = new BackAround();
        String result = b.BackAround("hello");
        assertEquals("ohelloo",result);
    }
    
    @Test
    public void a() {
        BackAround b = new BackAround();
        String result = b.BackAround("a");
        assertEquals("aaa",result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
