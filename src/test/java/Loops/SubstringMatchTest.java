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
public class SubstringMatchTest {

    public SubstringMatchTest() {
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
    public void matchxxcaazz_xxbaaz3() {
        SubstringMatch sm = new SubstringMatch();
        int result = sm.SubStringMatch("xxcaazz", "xxbaaz");
        assertEquals(3, result);
    }

    @Test
    public void matchabc_abc2() {
        SubstringMatch sm = new SubstringMatch();
        int result = sm.SubStringMatch("abc", "abc");
        assertEquals(2, result);
    }

    @Test
    public void matchabc_axc0() {
        SubstringMatch sm = new SubstringMatch();
        int result = sm.SubStringMatch("abc", "axc");
        assertEquals(0, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
