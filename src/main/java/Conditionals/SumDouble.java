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
public class SumDouble {

    //    Given two int values, return their sum. However, if the two values 
//            are the same, then return double their sum. 
//
//SumDouble(1, 2) -> 3
//SumDouble(3, 2) -> 5
//SumDouble(2, 2) -> 8
    
    public int SumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return (a + b) * 2;
        }
    }
    
}
