/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

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
public class CanHazTableTest {

    public CanHazTableTest() {
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
    public void t510() {
        CanHazTable ct = new CanHazTable();
        int result = ct.CanHazTable(5, 10);
        assertEquals(result, 2);
    }

    @Test
    public void f52() {
        CanHazTable ct = new CanHazTable();
        int result = ct.CanHazTable(5, 2);
        assertEquals(result, 0);
    }

    @Test
    public void m55() {
        CanHazTable ct = new CanHazTable();
        int result = ct.CanHazTable(5, 5);
        assertEquals(result, 1);
    }

    @Test
    public void t19() {
        CanHazTable ct = new CanHazTable();
        int result = ct.CanHazTable(1, 9);
        assertEquals(result, 0);
    }

// TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
