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
public class HasTeen {
    
    //    We'll say that a number is "teen" if it is in the range 13..19 
//    inclusive. Given 3 int values, return true if 1 or more of them are teen. 
//
//HasTeen(13, 20, 10) -> true
//HasTeen(20, 19, 10) -> true
//HasTeen(20, 10, 12) -> false
    
    public boolean HasTeen(int i1, int i2, int i3) {
        if (i1 >=13 && i1 <=19 ||
            i2 >=13 && i2 <=19 ||
            i3 >=13 && i3 <=19) {
            return true;
        } else {
            return false;
        }
    }
    
}
