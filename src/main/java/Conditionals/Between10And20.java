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
public class Between10And20 {
    
    //    Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
//
//Between10and20(12, 99) -> true
//Between10and20(21, 12) -> true
//Between10and20(8, 99) -> false
    
    public boolean Between10And20(int a, int b) {
        if (a >=10 && a <=20 || b >= 10 && b <=20) {
            return true;
        } else {
            return false;
        }
    }
    
}
