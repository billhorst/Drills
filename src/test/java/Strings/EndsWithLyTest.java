/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

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
public class EndsWithLyTest {

    public EndsWithLyTest() {
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
    public void oddlyt() {
        EndsWithLy e = new EndsWithLy();
        boolean result = e.EndsWithLy("oddly");
        assertTrue(result);
    }

    @Test
    public void y() {
        EndsWithLy e = new EndsWithLy();
        boolean result = e.EndsWithLy("y");
        assertFalse(result);
    }

    @Test
    public void oddy() {
        EndsWithLy e = new EndsWithLy();
        boolean result = e.EndsWithLy("oddy");
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
