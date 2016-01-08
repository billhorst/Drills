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
public class RollDiceTest {
    
    public RollDiceTest() {
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
    public void rd23t5() {
        RollDice r = new RollDice();
        int result = r.RollDice(2, 3, true);
        assertEquals(5, result);
    }
    
    @Test
    public void rd33t7() {
        RollDice r = new RollDice();
        int result = r.RollDice(3, 3, true);
        assertEquals(7, result);
    }
    
    @Test
    public void rd33f6() {
        RollDice r = new RollDice();
        int result = r.RollDice(3, 3, false);
        assertEquals(6, result);
    }
    
    @Test
    public void rd61t7() {
        RollDice r = new RollDice();
        int result = r.RollDice(6, 1, true);
        assertEquals(7, result);
    }
    
    @Test
    public void rd55t11() {
        RollDice r = new RollDice();
        int result = r.RollDice(5, 5, true);
        assertEquals(11, result);
    }
    
    @Test
    public void rd66t7() {
        RollDice r = new RollDice();
        int result = r.RollDice(6, 6, true);
        assertEquals(7, result);
    }
    
    @Test
    public void rd66f12() {
        RollDice r = new RollDice();
        int result = r.RollDice(6, 6, false);
        assertEquals(12, result);
    }
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
