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
public class InOrderEqual {
//    Given three ints, a b c, return true if they are in strict 
//            increasing order, such as 2 5 11, or 5 6 7, but not
//                    6 5 7 or 5 5 7. However, with the exception 
//                            that if "equalOk" is true, equality is
//                                    allowed, such as 5 5 7 or 5 5 5. 
//
//InOrderEqual(2, 5, 11, false) → true
//InOrderEqual(5, 7, 6, false) → false
//InOrderEqual(5, 5, 7, true) → true

    public boolean InOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean result = true;
        if (equalOk == false) {
            if (a < b && b < c) {
                result = true;
            } else {
                result = false;
            }
        } else if (equalOk == true) {
            if ((a < b && b < c) || (a == b && b < c) || (a < b && b == c)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
