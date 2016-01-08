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
public class AlarmClock {

//    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a 
//    booleanean indicating if we are on vacation, return a string of 
//            the form "7:00" indicating when the alarm clock should ring. Weekdays, 
//                    the alarm should be "7:00" and on the weekend it should be "10:00".
//                    Unless we are on vacation -- then on weekdays it should be "10:00" 
//                    and weekends it should be "off". 
//
//AlarmClock(1, false) → "7:00"
//AlarmClock(5, false) → "7:00"
//AlarmClock(0, false) → "10:00"
    public String AlarmClock(int day, boolean vacation) {
        String alarm = "";
        if (vacation == false) {
            if (day > 0 && day < 6) {
                alarm = "7:00";
            } else {
                alarm = "10:00";
            }
        } else if (vacation == true) {
            if (day > 0 && day < 6) {
                alarm = "10:00";
            } else {
                alarm = "off";
            }
        }
        return alarm;
    }

}
