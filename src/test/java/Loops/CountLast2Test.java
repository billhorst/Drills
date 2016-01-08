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
public class CountLast2Test {

    public CountLast2Test() {
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
    public void hixxhi() {
        CountLast2 c = new CountLast2();
        int result = c.CountLast2("hixxhi");
        assertEquals(1, result);
    }

    @Test
    public void xaxxaxaxx() {
        CountLast2 c = new CountLast2();
        int result = c.CountLast2("xaxxaxaxx");
        assertEquals(1, result);
    }

    @Test
    public void axxxaaaxx() {
        CountLast2 c = new CountLast2();
        int result = c.CountLast2("axxxaaaxx");
        assertEquals(2, result);
    }

    @Test
    public void halibabalipubababa() {
        CountLast2 c = new CountLast2();
        int result = c.CountLast2("halibabalipubababa");
        assertEquals(4, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
