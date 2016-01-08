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
public class Multiple3Or5Test {

    public Multiple3Or5Test() {
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
    public void m3() {
        Multiple3Or5 m = new Multiple3Or5();
        boolean result = m.Multiple3Or5(3);
        assertEquals(true, result);
    }

    @Test
    public void m10() {
        Multiple3Or5 m = new Multiple3Or5();
        boolean result = m.Multiple3Or5(10);
        assertEquals(true, result);
    }

    @Test
    public void m8() {
        Multiple3Or5 m = new Multiple3Or5();
        boolean result = m.Multiple3Or5(8);
        assertEquals(false, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
