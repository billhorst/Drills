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
public class SubstringMatch {

//    Given 2 strings, a and b, return the number of the positions where they 
//            contain the same length 2 substring. So "xxcaazz" and "xxbaaz" 
//            yields 3, since the "xx", "aa", and "az" substrings appear in the 
//                    same place in both strings. 
//
//SubStringMatch("xxcaazz", "xxbaaz") -> 3
//SubStringMatch("abc", "abc") -> 2
//SubStringMatch("abc", "axc") -> 0
    public int SubStringMatch(String a, String b) {
        int match = 0;
        if (a.length() >= b.length()) {
            for (int i = 0; i < b.length() - 1; i++) {
                if ((a.substring(i, i + 2).equals(b.substring(i, i + 2)))) {
                    match++;
                }
            }
        } else if (a.length() < b.length()) {
            for (int i = 0; i < a.length() - 1; i++) {
                if ((a.substring(i, i + 2).equals(b.substring(i, i + 2)))) {
                    match++;
                }
            }
        }
        return match;
    }

}
