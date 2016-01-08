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
public class StringTimes {
//    Given a string and a non-negative int n, return a larger string that is n 
//            copies of the original string. 
//
//StringTimes("Hi", 2) -> "HiHi"
//StringTimes("Hi", 3) -> "HiHiHi"
//StringTimes("Hi", 1) -> "Hi"

    public String StringTimes(String str, int n) {

        String ans = "";
        for (int i = 0; i < n; i++) {
            ans = ans + str;
        }
        return ans;
    }

}
