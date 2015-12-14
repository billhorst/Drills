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
public class TrimOne {
    
//    Given a string, return a version without the first and last char, 
//    so "Hello" yields "ell". The string length will be at least 2. 
//
//TrimOne("Hello") -> "ell"
//TrimOne("java") -> "av"
//TrimOne("coding") -> "odin"
    
    public String TrimOne(String str) {
        return str.substring(1, str.length()-1);
    }    
    
}
