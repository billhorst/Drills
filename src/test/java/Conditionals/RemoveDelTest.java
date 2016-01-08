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
public class RemoveDelTest {

    public RemoveDelTest() {
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
    public void adelbc() {
        RemoveDel r = new RemoveDel();
        String result = r.RemoveDel("adelbc");
        assertEquals("abc", result);
    }

    @Test
    public void adelHello() {
        RemoveDel r = new RemoveDel();
        String result = r.RemoveDel("adelHello");
        assertEquals("aHello", result);
    }

    @Test
    public void adedbc() {
        RemoveDel r = new RemoveDel();
        String result = r.RemoveDel("adedbc");
        assertEquals("adedbc", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
