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
public class NotStringTest {

    public NotStringTest() {
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
    public void candy() {
        NotString n = new NotString();
        String result = n.NotString("candy");
        assertEquals("not candy", result);
    }

    @Test
    public void x() {
        NotString n = new NotString();
        String result = n.NotString("x");
        assertEquals("not x", result);
    }

    @Test
    public void not_bad() {
        NotString n = new NotString();
        String result = n.NotString("not bad");
        assertEquals("not bad", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
