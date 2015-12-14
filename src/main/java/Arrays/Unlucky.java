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
public class Unlucky {
    
//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
//Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array. 
//
//Unlucky1({1, 3, 4, 5}) -> true
//Unlucky1({2, 1, 3, 4, 5}) -> true
//Unlucky1({1, 1, 1}) -> false

    public boolean Unlucky1(int[] numbers) {
        boolean unlucky1 = false;
        for (int i = 0; i < numbers.length; i++) {
            if (i==0&&numbers[i]==1&&numbers[i+1]==3 || 
                i==1&&numbers[i]==1&&numbers[i+1]==3 ||
                i==numbers.length-2&&numbers[i]==1&&numbers[i+1]==3) {
                unlucky1 = true;
            }
        } return unlucky1;
    }
    
}
