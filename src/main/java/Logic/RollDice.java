/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Bill
 */
public class RollDice {
//    Return the sum of two 6-sided dice rolls, each in the range 
//            1..6. However, if noDoubles is true, if the two 
//                    dice show the same value, increment one
//                            die to the next value, wrapping 
//                                    around to 1 if its value was 6. 
//
//RollDice(2, 3, true) → 5
//RollDice(3, 3, true) → 7
//RollDice(3, 3, false) → 6

    public int RollDice(int die1, int die2, boolean noDoubles) {
        int sum = 0;
        if (noDoubles) {
            if (die1 == 6 && die2 == 6) {
                sum = 7;
            } else if (die1 == die2) {
                sum = die1 + die2 + 1;
            } else {
                sum = die1 + die2;
            }
        } else if (noDoubles == false) {
            sum = die1 + die2;
        }
        return sum;
    }
}
