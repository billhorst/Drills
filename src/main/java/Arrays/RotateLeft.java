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
public class RotateLeft {

//    Given an array of ints, return an array with the elements 
//            "rotated left" so {1, 2, 3} yields {2, 3, 1}. 
//
//RotateLeft({1, 2, 3}) -> {2, 3, 1}
//RotateLeft({5, 11, 9}) -> {11, 9, 5}
//RotateLeft({7, 0, 0}) -> {0, 0, 7}
    public int[] RotateLeft(int[] numbers) {
        int[] newArray = numbers;
        for (int i = 0; i < numbers.length - 1; i++) {
            newArray[i] = numbers[i + 1];
        }
        newArray[numbers.length - 1] = numbers[0];

        return newArray;

    }

}
