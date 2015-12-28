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
public class SoAlone {
    
    //    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
//            Given 2 int values, return true if one or the other is teen, but not both. 
//
//SoAlone(13, 99) -> true
//SoAlone(21, 19) -> true
//SoAlone(13, 13) -> false
    
    public boolean SoAlone(int a, int b) {
        if (a >= 13 && a <= 19 && (b < 13 || b > 19)) {
            return true;
        } else if (b >= 13 && b <= 19 && (a < 13 || a > 19)) {
            return true;
        } else {
            return false;
        }
    }
    
}
