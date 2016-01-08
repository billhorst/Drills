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
public class FrontTimes {
// Given a string and a non-negative int n, we'll say that the front of the 
//         string is the first 3 chars, or whatever is there if the string 
//                 is less than length 3. Return n copies of the front; 
//
//FrontTimes("Chocolate", 2) -> "ChoCho"
//FrontTimes("Chocolate", 3) -> "ChoChoCho"
//FrontTimes("Abc", 3) -> "AbcAbcAbc"

    public String FrontTimes(String str, int n) {
        String f3 = str.substring(0, 3);
        String fin = "";
        for (int i = 0; i < n; i++) {
            fin = fin + f3;
        }
        return fin;
    }

}
