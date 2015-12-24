/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import static java.lang.StrictMath.abs;

/**
 *
 * @author Bill
 */
public class NearHundred {
    
    //    Given an int n, return true if it is within 10 of 100 or 200.
//NearHundred(103) -> true
//NearHundred(90) -> true
//NearHundred(89) -> false
    
    public boolean NearHundred(int n) {
        if (abs(n-100) <= 10 || abs(n-200) <= 10) {
            return true;
        } else {
            return false;
        }
    }
    
}
