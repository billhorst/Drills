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
public class FrontBack {

    //    Given a string, return a new string where the first and last chars have been exchanged. 
//
//FrontBack("code") -> "eodc"
//FrontBack("a") -> "a"
//FrontBack("ab") -> "ba"
    public String FrontBack(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            String first = s.substring(0, 1);
            String last = s.substring(s.length() - 1, s.length());
            String middle = s.substring(1, s.length() - 1);

            return last + middle + first;
        }
    }

}
