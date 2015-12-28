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
public class RemoveDel {
    
    //    Given a string, if the string "del" appears starting 
//            at index 1, return a string where that "del"
//            has been deleted. Otherwise, return the string unchanged. 
//
//RemoveDel("adelbc") -> "abc"
//RemoveDel("adelHello") -> "aHello"
//RemoveDel("adedbc") -> "adedbc"
    
    public String RemoveDel(String s) {
        
        String twoThreeFour = s.substring(1, 4);
        
        if (twoThreeFour.equals("del")) {
            return s.substring(0, 1) + s.substring(4);
        } else {
            return s;
        }
        
    }
    
}
