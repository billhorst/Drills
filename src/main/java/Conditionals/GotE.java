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
public class GotE {
    
    //    Return true if the given string contains between 1 and 3 'e' chars. 
//
//GotE("Hello") -> true
//GotE("Heelle") -> true
//GotE("Heelele") -> false
    
    public boolean GotE(String s) {
        String[] array = s.split("");
        int eCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("e")) {
                eCount++;
            }
        }
        if (eCount >= 1 && eCount <= 3) {
            return true;
        } else {
            return false;
        }
    }
    
}
