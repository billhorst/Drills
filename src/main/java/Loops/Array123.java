/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author Bill
 */
public class Array123 {
//    Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere. 
//
//Array123({1, 1, 2, 3, 1}) -> true
//Array123({1, 1, 2, 4, 1}) -> false
//Array123({1, 1, 2, 1, 2, 3}) -> true

    public boolean Array123(int[] numbers) {
        boolean one23 = true;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] == 1) && (numbers[i] + 1 == 2) && (numbers[i] + 2 == 3)) {
                one23 = true;
            } else {
                one23 = false;
            }
        }
        return one23;
    }
}
