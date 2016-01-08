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
public class AltPairs {

//        Given a string, return a string made of the chars at indexes 
//0,1, 4,5, 8,9 ... so "kittens" yields "kien". 
//
//AltPairs("kitten") -> "kien"
//AltPairs("Chocolate") -> "Chole"
//AltPairs("CodingHorror") -> "Congrr"
    public String AltPairs(String str) {
        String it = "";
        String last = "";
        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i = i + 4) {
                it = it + str.substring(i, i + 2);
            }
        } else {
            for (int i = 0; i < str.length() - 1; i = i + 4) {
                it = it + str.substring(i, i + 2);
                last = str.substring(str.length() - 1, str.length());
            }
            it = it + last;
        }
        return it;
    }

}
