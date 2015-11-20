/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Bill
 * 
 * 
 */

//    Given an int array , return true if it contains an even number (HINT: Use Mod (%)). 
//
//HasEven({2, 5}) -> true
//HasEven({4, 3}) -> true
//HasEven({7, 5}) -> false

public class HasEven {
    
    public boolean HasEven(int[] numbers) {
        boolean hasEven = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                hasEven = true;
                break;
            }
        }return hasEven;
    } 
    
}
