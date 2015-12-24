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
public class EveryNth {
    
    //    Given a non-empty string and an int N, return the string made starting
//            with char 0, and then every Nth char of the string. So 
//                    if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more. 
//
//EveryNth("Miracle", 2) -> "Mrce"
//EveryNth("abcdefg", 2) -> "aceg"
//EveryNth("abcdefg", 3) -> "adg"
    
    public String EveryNth(String s, int nth) {
        String[] array = s.split("");
        String results = "";
        for (int i = 0; i < array.length; i++) {
            if (i%nth == 0) {
                results = results + array[i+1];
            }
        }
        
        return results;
    }
    
}
