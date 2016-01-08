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
public class SumDoubleTest {

    public SumDoubleTest() {
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
    public void s123() {
        SumDouble s = new SumDouble();
        int result = s.SumDouble(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void s325() {
        SumDouble s = new SumDouble();
        int result = s.SumDouble(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void s228() {
        SumDouble s = new SumDouble();
        int result = s.SumDouble(2, 2);
        assertEquals(8, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
