/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

/**
 *
 * @author Bill
 */
public class IxStart {
    
    //    Return true if the given string begins with "*ix", the '*'
//    can be anything, so "pix", "9ix" .. all count. 
//
//IxStart("mix snacks") -> true
//IxStart("pix snacks") -> true
//IxStart("piz snacks") -> false
    
    public  boolean IxStart(String s) {
        if (s.substring(1, 3).equals("ix")) {
            return true;
        } else {
            return false;
        }
    }
    
}
