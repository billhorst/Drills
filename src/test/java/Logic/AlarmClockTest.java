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
public class AlarmClockTest {
    
    public AlarmClockTest() {
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
    public void ac1f() {
        AlarmClock ac = new AlarmClock();
        String result = ac.AlarmClock(1, false);
        assertEquals("7:00", result);
    }
    
    @Test
    public void ac5f() {
        AlarmClock ac = new AlarmClock();
        String result = ac.AlarmClock(5, false);
        assertEquals("7:00", result);
    }
    
    @Test
    public void ac0f() {
        AlarmClock ac = new AlarmClock();
        String result = ac.AlarmClock(0, false);
        assertEquals("10:00", result);
    }
    
    @Test
    public void ac10t() {
        AlarmClock ac = new AlarmClock();
        String result = ac.AlarmClock(1, true);
        assertEquals("10:00", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
