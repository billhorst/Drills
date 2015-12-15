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
public class EndsWithLy {

//   Given a string, return true if it ends in "ly". 
//
//EndsWithLy("oddly") -> true
//EndsWithLy("y") -> false
//EndsWithLy("oddy") -> false
    public boolean EndsWithLy(String s) {
        if (s.length() < 2) {
            return false;
        } else {
            if (s.substring(s.length() - 2, s.length()).equals("ly")) {
                return true;
            } else {
                return false;
            }
        }
    }

}
