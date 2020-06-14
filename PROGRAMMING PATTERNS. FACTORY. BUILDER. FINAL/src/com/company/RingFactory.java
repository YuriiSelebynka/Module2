/*
 *
 * Classame : Java Development (K)
 *
 *  13 June 2020
 *
 * Created by Selebynka Yurii (UzhNU)
 *
 *  Programming patterns. Factory. Builder.
 *
 *    Develop for your class
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student.
 *
 * */

package com.company;

        // 1. Factory
    /*Here we create factory for class Ring*/

public class RingFactory {

    public static Ring create (double r,double R) {

        Ring nibelung = new Ring (r, R);
        
        return nibelung;
    }
}
