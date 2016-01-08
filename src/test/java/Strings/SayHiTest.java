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
public class SayHiTest {

    public SayHiTest() {
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
    public void SayHiBob() {
        SayHi sh = new SayHi();
        String result = sh.SayHi("Bob");
        assertEquals("Hello Bob", result);
    }

    @Test
    public void SayHiBill() {
        SayHi sh = new SayHi();
        String result = sh.SayHi("Bill");
        assertEquals("Hello Bill", result);
    }

    @Test
    public void SayHiBonito() {
        SayHi sh = new SayHi();
        String result = sh.SayHi("Bonito");
        assertEquals("Hello Bonito", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
