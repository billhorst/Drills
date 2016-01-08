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
public class CaughtSpeeding {

//    You are driving a little too fast, and a police officer stops you. 
//            Write code to compute the result, encoded as an int value: 0=no ticket, 
//                    1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. 
//                    If speed is between 61 and 80 inclusive, the result is 1. 
//                    If speed is 81 or more, the result is 2. Unless it is your birthday -- 
//                    on that day, your speed can be 5 higher in all cases. 
//
//CaughtSpeeding(60, false) → 0
//CaughtSpeeding(65, false) → 1
//CaughtSpeeding(65, true) → 0
    public int CaughtSpeeding(int speed, boolean isBirthday) {
        int ticket = 0;
        if (isBirthday) {
            speed = speed - 5;
        }

        if (speed <= 60) {
            ticket = 0;
        } else if (speed > 60 && speed <= 80) {
            ticket = 1;
        } else {
            ticket = 2;
        }
        return ticket;
    }

}
