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
public class EndUpTest {

    public EndUpTest() {
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
    public void hello() {
        EndUp e = new EndUp();
        String result = e.EndUp("hello");
        assertEquals("heLLO", result);
    }

    @Test
    public void hithere() {
        EndUp e = new EndUp();
        String result = e.EndUp("hi there");
        assertEquals("hi thERE", result);
    }

    @Test
    public void hi() {
        EndUp e = new EndUp();
        String result = e.EndUp("hi");
        assertEquals("HI", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
