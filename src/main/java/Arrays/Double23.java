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

//Given an int array, return true if the array contains 2 twice, or 3 twice. 
//
//Double23({2, 2, 3}) -> true
//Double23({3, 4, 5, 3}) -> true
//Double23({2, 3, 2, 2}) -> false

public class Double23 { 
    
    public boolean Double23(int[] numbers) {
        boolean twice;
        int twoCount = 0;
        int threeCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                twoCount++;
            }
            if (numbers[i] == 3) {
                threeCount++;
            }
        }
        
        if (twoCount == 2 || threeCount == 2) {
            twice = true;
        } else {
            twice = false;
        }
        return twice;
    }
    
}
