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
public class MiddleTwo {

//    Given a string of even length, return a string made of the middle
//            two chars, so the string "string" yields "ri". The string 
//                    length will be at least 2. 
//
//MiddleTwo("string") -> "ri"
//MiddleTwo("code") -> "od"
//MiddleTwo("Practice") -> "ct"
    public String MiddleTwo(String s) {
        return s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
    }

}
