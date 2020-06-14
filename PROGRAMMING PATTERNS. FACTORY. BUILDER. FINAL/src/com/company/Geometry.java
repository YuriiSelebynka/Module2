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

        //  2. Abstract factory.
    /*Here we create interface for our geometry figures*/

public interface Geometry {

    double getArea();
    double getLinearLength();
}
