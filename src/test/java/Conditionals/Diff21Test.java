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
public class Diff21Test {

    public Diff21Test() {
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
    public void d21234() {
        Diff21 d = new Diff21();
        int result = d.Diff21(23);
        assertEquals(4, result);
    }

    @Test
    public void d211011() {
        Diff21 d = new Diff21();
        int result = d.Diff21(10);
        assertEquals(11, result);
    }

    @Test
    public void d21210() {
        Diff21 d = new Diff21();
        int result = d.Diff21(21);
        assertEquals(0, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
