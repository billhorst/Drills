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
public class StringX {

//    Given a string, return a version where all the "x" have been removed.
//            Except an "x" at the very start or end should not be removed. 
//
//StringX("xxHxix") -> "xHix"
//StringX("abxxxcd") -> "abcd"
//StringX("xabxxxcdx") -> "xabcdx"
    public String StringX(String str) {
        String newStr1X = "";
        String newStrlX = "";
        String newStrm = "";

        if (str.substring(0, 1).equals("x")) {
            newStr1X = "x";
        }

        newStrm = str.replaceAll("x", "");

        if (str.substring(str.length() - 1, str.length()).equals("x")) {
            newStrlX = "x";
        }

        return newStr1X + newStrm + newStrlX;

    }

}
