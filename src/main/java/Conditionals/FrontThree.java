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
public class FrontThree {
    
    //    Given a string, we'll say that the front is the first 3 chars of the 
//            string. If the string length is less than 3, the front is 
//                    whatever is there. Return a new string which is 3 
//                    copies of the front. 
//
//Front3("Microsoft") -> "MicMicMic"
//Front3("Chocolate") -> "ChoChoCho"
//Front3("at") -> "atatat"
    
    public String FrontThree(String s) {
        if (s.length() < 3) {
            return s+s+s;
        } else {
            return s.substring(0, 3)+s.substring(0, 3)+s.substring(0, 3);
        }
    }
    
}
