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
public class MakeTagsTest {

    public MakeTagsTest() {
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
    public void iHello() {
        MakeTags mt = new MakeTags();
        String result = mt.MakeTags("i", "Hello");
        assertEquals("<i>Hello</i>", result);
    }

    @Test
    public void iYay() {
        MakeTags mt = new MakeTags();
        String result = mt.MakeTags("i", "Yay");
        assertEquals("<i>Yay</i>", result);
    }

    @Test
    public void citeYay() {
        MakeTags mt = new MakeTags();
        String result = mt.MakeTags("cite", "Yay");
        assertEquals("<cite>Yay</cite>", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
