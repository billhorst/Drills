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
public class InsertWordTest {

    public InsertWordTest() {
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
    public void hi() {
        InsertWord iw = new InsertWord();
        String result = iw.InsertWord("<<>>", "hi");
        assertEquals("<<hi>>", result);
    }

    @Test
    public void hello() {
        InsertWord iw = new InsertWord();
        String result = iw.InsertWord("(())", "hello");
        assertEquals("((hello))", result);
    }

    @Test
    public void you() {
        InsertWord iw = new InsertWord();
        String result = iw.InsertWord("iajw", "you");
        assertEquals("iayoujw", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
