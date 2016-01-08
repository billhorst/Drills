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
public class Mod35 {
//    
//    Return true if the given non-negative number is a multiple of 3 or 
//            5, but not both. Use the % "mod" operator
//
//Mod35(3) → true
//Mod35(10) → true
//Mod35(15) → false

    public boolean Mod35(int n) {
        boolean result = true;
        if (n % 15 == 0) {
            result = false;
        } else if (n % 3 == 0 || n % 5 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
