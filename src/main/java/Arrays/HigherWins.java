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
public class HigherWins {

//    Given an array of ints, figure out which is larger between the first and 
//            last elements in the array, and set all the other elements to be 
//                    that value. Return the changed array. 
//
//HigherWins({1, 2, 3}) -> {3, 3, 3}
//HigherWins({11, 5, 9}) -> {11, 11, 11}
//HigherWins({2, 11, 3}) -> {3, 3, 3}
    public int[] HigherWins(int[] numbers) {
        if (numbers[0] > numbers[numbers.length - 1]) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = numbers[0];
            }

        } else if (numbers[0] < numbers[numbers.length - 1]) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = numbers[numbers.length - 1];
            }
        }
        return numbers;

    }

}
