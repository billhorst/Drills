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
public class CountLast2 {
//    Given a string, return the count of the number of times that a substring
//            length 2 appears in the string and also as the last 2 chars of the 
//                    string, so "hixxxhi" yields 1 (we won't count the end substring). 
//
//CountLast2("hixxhi") -> 1
//CountLast2("xaxxaxaxx") -> 1
//CountLast2("axxxaaxx") -> 2

    public int CountLast2(String str) {
        int counter = 0;
        String l2 = str.substring(str.length() - 2, str.length());
        for (int i = 0; i < str.length() - 3; i++) {
            if (l2.equals(str.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }
}
