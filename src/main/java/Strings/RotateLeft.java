/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Bill
 */
public class RotateLeft {

//    Given a string, return a "rotated left 2" version where 
//            the first 2 chars are moved to the end. The string
//                    length will be at least 2. 
//
//Rotateleft2("Hello") -> "lloHe"
//Rotateleft2("java") -> "vaja"
//Rotateleft2("Hi") -> "Hi"
    public String RotateLeft(String s) {
        String firstTwo = s.substring(0, 2);
        return s.substring(2, s.length()) + firstTwo;
    }

}
