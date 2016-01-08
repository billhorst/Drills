/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Bill
 */
public class LastDigit {
//    Given three ints, a b c, return true if two or more
//            of them have the same rightmost digit. The 
//                    ints are non-negative. 
//
//LastDigit(23, 19, 13) → true
//LastDigit(23, 19, 12) → false
//LastDigit(23, 19, 3) → true

    public boolean LastDigit(int a, int b, int c) {
        while (a >= 10) {
            a = a - 10;
        }
        while (b >= 10) {
            b = b - 10;
        }
        while (c >= 10) {
            c = c - 10;
        }
        boolean result = true;
        if (a == b || a == c || b == c) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
