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
public class EveryOtherTest {

    public EveryOtherTest() {
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
        EveryOther e = new EveryOther();
        String result = e.EveryOther("Hello");
        assertEquals("Hlo", result);
    }

    @Test
    public void heeololeo() {
        EveryOther e = new EveryOther();
        String result = e.EveryOther("Heeololeo");
        assertEquals("Hello", result);
    }

    @Test
    public void h() {
        EveryOther e = new EveryOther();
        String result = e.EveryOther("H");
        assertEquals("H", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
