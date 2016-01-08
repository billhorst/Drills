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
public class GotETest {

    public GotETest() {
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
        GotE e = new GotE();
        boolean result = e.GotE("Hello");
        assertTrue(result);
    }

    @Test
    public void heelle() {
        GotE e = new GotE();
        boolean result = e.GotE("Heelle");
        assertTrue(result);
    }

    @Test
    public void heelele() {
        GotE e = new GotE();
        boolean result = e.GotE("Heelele");
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
