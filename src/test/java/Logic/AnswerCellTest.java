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
public class AnswerCellTest {
    
    public AnswerCellTest() {
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
    public void ffft() {
        AnswerCell ac = new AnswerCell();
        boolean result = ac.AnswerCell(false, false, false);
        assertTrue(result);
    }
    
    @Test
    public void fftf() {
        AnswerCell ac = new AnswerCell();
        boolean result = ac.AnswerCell(false, false, true);
        assertFalse(result);
    }
    
    @Test
    public void tfff() {
        AnswerCell ac = new AnswerCell();
        boolean result = ac.AnswerCell(true, false, false);
        assertFalse(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
