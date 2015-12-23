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
public class Closer {
    
    //    Given 2 int values, return whichever value is nearest
//    to the value 10, or return 0 in the event of a tie. 
//
//Closer(8, 13) -> 8
//Closer(13, 8) -> 8
//Closer(13, 7) -> 0
    
    public int Closer(int a, int b) {
        int resA = abs(10 - a);
        int resB = abs(10 - b);
        
        if (resA < resB) {
            return a;
        } else if (resB < resA ) {
            return b;
        } else {
            return 0;
        }
    }
    
}
