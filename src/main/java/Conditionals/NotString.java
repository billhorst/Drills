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
public class NotString {
    
    //    Given a string, return a new string where "not " has been added to 
//            the front. However, if the string already begins with "not",
//            return the string unchanged.
//
//Hint: Look up how to use "SubString" in c#
//
//NotString("candy") -> "not candy"
//NotString("x") -> "not x"
//NotString("not bad") -> "not bad"
    
    public String NotString(String s) {
        if (s.length()<5) {
            return "not " + s;
        } else if (s.substring(0, 3).equals("not")) {
            return s;
        } else {
            return "not " + s;
        }
    }
    
}
