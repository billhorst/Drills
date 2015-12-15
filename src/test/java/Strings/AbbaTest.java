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
public class AbbaTest {
    
    public AbbaTest() {
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
    public void hiBye() {
        Abba ab = new Abba();
        String result = ab.Abba("hi", "Bye");
        assertEquals("hiByeByehi", result);
    }
    
        @Test
    public void yoAlice() {
        Abba ab = new Abba();
        String result = ab.Abba("Yo", "Alice");
        assertEquals("YoAliceAliceYo", result);
    }
    
        @Test
    public void whatUp() {
        Abba ab = new Abba();
        String result = ab.Abba("What", "Up");
        assertEquals("WhatUpUpWhat", result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
