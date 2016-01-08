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
public class FrontTimesTest {

    public FrontTimesTest() {
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
    public void chocolate2() {
        FrontTimes f = new FrontTimes();
        String result = f.FrontTimes("Chocolate", 2);
        assertEquals("ChoCho", result);
    }

    @Test
    public void chocolate3() {
        FrontTimes f = new FrontTimes();
        String result = f.FrontTimes("Chocolate", 3);
        assertEquals("ChoChoCho", result);
    }

    @Test
    public void abc3() {
        FrontTimes f = new FrontTimes();
        String result = f.FrontTimes("Abc", 3);
        assertEquals("AbcAbcAbc", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
