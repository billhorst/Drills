/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author Bill
 */
public class StringSplosion {
//    Given a non-empty string like "Code" return a string like "CCoCodCode".  
//    (first char, first two, first 3, etc)
//
//StringSplosion("Code") -> "CCoCodCode"
//StringSplosion("abc") -> "aababc"
//StringSplosion("ab") -> "aab"

    public String StringSplosion(String str) {
        String sent = "";
        for (int i = 0; i < str.length() + 1; i++) {
            sent = sent + str.substring(0, i);
        }
        return sent;
    }
}
