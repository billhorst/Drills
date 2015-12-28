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
public class StartOz {
    
    //    Given a string, return a string made of the first 2 chars
//         (if present), however include first char only if it is
//                 'o' and include the second only if it is 'z', so 
//                         "ozymandias" yields "oz". 
//
//StartOz("ozymandias") -> "oz"
//StartOz("bzoo") -> "z"
//StartOz("oxx") -> "o"
    
    public String StartOz(String s) {
        String firstLetter = s.substring(0, 1);
        String secondLetter = s.substring(1, 2);
        
        String newString = "";
        
        if (firstLetter.equals("o")) {
            newString = newString + "o";
        }
        
        if (secondLetter.equals("z")) {
            newString = newString + "z";
        }
        
        return newString;
    }
    
}
