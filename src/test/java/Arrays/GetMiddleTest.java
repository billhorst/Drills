/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

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
public class GetMiddleTest {
    
    public GetMiddleTest() {
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
    public void t12345625() {
    GetMiddle g = new GetMiddle();
    int[] a = {1,2,3};
    int[] b = {4,5,6};
    int[] exp = {2,5};
    assertArrayEquals(exp,g.GetMiddle(a, b));
}
    @Test
    public void t77738078() {
    GetMiddle g = new GetMiddle();
    int[] a = {7,7,7};
    int[] b = {3,8,0};
    int[] exp = {7,8};
    assertArrayEquals(exp,g.GetMiddle(a, b));
}
    @Test
    public void t52914524() {
    GetMiddle g = new GetMiddle();
    int[] a = {5,2,9};
    int[] b = {1,4,5};
    int[] exp = {2,4};
    assertArrayEquals(exp,g.GetMiddle(a, b));
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
