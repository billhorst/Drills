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
public class MakePi {
    
//    Return an int array length n containing the first n digits of pi.
//
//MakePi(3) -> {3, 1, 4}
    
    String pi;
    public int[] MakePi(int n) {
        int[] array = new int[n];
        pi = Double.toString(Math.PI / 10);
        String[] piString = pi.split(pi);

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(piString[n]);
            n++;
        }
        return array;
    }    
    
}
