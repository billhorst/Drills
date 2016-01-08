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
public class ArrayFont9 {
//    Given an array of ints, return true if one of the first 4 
//    elements in the array is a 9. The array length may be less than 4. 
//
//ArrayFront9({1, 2, 9, 3, 4}) -> true
//ArrayFront9({1, 2, 3, 4, 9}) -> false
//ArrayFront9({1, 2, 3, 4, 5}) -> false

    public boolean ArrayFont9(int[] numbers) {
        int count = 0;
        boolean nine = true;
        for (int i = 0; i < 4; i++) {
            if (numbers[i] == 9) {
                count++;
            }
            if (count > 0) {
                nine = true;
            } else {
                nine = false;
            }
        }
        return nine;
    }
}
