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
public class Count9 {
//    Given an array of ints, return the number of 9's in the array. 
//
//Count9({1, 2, 9}) -> 1
//Count9({1, 9, 9}) -> 2
//Count9({1, 9, 9, 3, 9}) -> 3

    public int Count9(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 9) {
                count++;
            }
        }
        return count;
    }

}
