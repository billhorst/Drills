/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Bill
 */
public class Reverse {

//    Given an array of ints length 3, return a new array with the 
//            elements in reverse order, so for example {1, 2, 3} becomes {3, 2, 1}. 
    public int[] Reverse(int[] numbers) {
        int[] newArray = new int[3];
        newArray[0] = numbers[2];
        newArray[1] = numbers[1];
        newArray[2] = numbers[0];
        return newArray;

    }
}
