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
public class StartHi {
    
    //    Given a string, return true if the string starts with "hi" and false otherwise. 
//
//StartHi("hi there") -> true
//StartHi("hi") -> true
//StartHi("high up") -> false
    
    public boolean StartHi(String s) {
        if (s.length() == 2 && s.equals("hi")) {
            return true;
        } else if (s.substring(0, 3).equals("hi ")) {
            return true;
        } else {
            return false;
        }
    }
    
}
