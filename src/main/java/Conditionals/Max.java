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
public class Max {
    
    //    Given three int values, a b c, return the largest. 
//
//Max(1, 2, 3) -> 3
//Max(1, 3, 2) -> 3
//Max(3, 2, 1) -> 3
    
    public int Max(int a, int b, int c) {
        int biggest;
        if (a > b) {
            biggest = a;
        } else {
            biggest = b;
        }
        
        if (biggest > c) {
            return biggest;
        } else {
            biggest = c;
        }
        
        return biggest;
    }
    
}
