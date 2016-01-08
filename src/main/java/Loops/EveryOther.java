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
public class EveryOther {
//    Given a string, return a new string made of every other char starting 
//            with the first, so "Hello" yields "Hlo". 
//
//EveryOther("Hello") -> "Hlo"
//EveryOther("Hi") -> "H"
//EveryOther("Heeololeo") -> "Hello"

    public String EveryOther(String str) {
        String sent = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sent = sent + str.substring(i, i + 1);
            }

        }
        return sent;
    }
}
