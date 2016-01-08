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
public class CountXX {
// Count the number of "xx" in the given string. We'll say that overlapping is
//         allowed, so "xxx" contains 2 "xx". 
//
//CountXX("abcxx") -> 1
//CountXX("xxx") -> 2
//CountXX("xxxx") -> 3

    public int CountXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }
}
