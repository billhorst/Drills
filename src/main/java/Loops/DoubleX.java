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
public class DoubleX {
//    Given a string, return true if the first instance of "x" in the string 
//            is immediately followed by another "x". 
//
//DoubleX("axxbb") -> true
//DoubleX("axaxxax") -> false
//DoubleX("xxxxx") -> true

    public boolean DoubleX(String str) {
        boolean fxx = true;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase("x") && str.substring(i + 1, i + 2).equalsIgnoreCase("x")) {
                fxx = true;
                break;
            } else if (str.substring(i, i + 1).equalsIgnoreCase("x") && !str.substring(i + 1, i + 2).equals("x")) {
                fxx = false;
                break;
            } else {
                fxx = false;

            }
        }
        return fxx;

    }
}
