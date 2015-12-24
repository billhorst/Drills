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
public class EndUp {
    
    //    Given a string, return a new string where the last 3 chars are now 
//            in upper case. If the string has less than 3 chars, uppercase
//                    whatever is there. 
//
//EndUp("Hello") -> "HeLLO"
//EndUp("hi there") -> "hi thERE"
//EndUp("hi") -> "HI"
    
    public String EndUp(String s) {
        if (s.length() >= 3) {
            return s.substring(0, s.length()-3)+s.substring(s.length()-3).toUpperCase();
        } else {
            return s.toUpperCase();
        }
    }
    
}
