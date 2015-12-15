/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Bill
 */
public class FirstHalf {
    
//    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 
//
//FirstHalf("WooHoo") -> "Woo"
//FirstHalf("HelloThere") -> "Hello"
//FirstHalf("abcdef") -> "abc"
    
    public String FirstHalf(String s) {
        return s.substring(0, s.length()/2);
    }
    
}
