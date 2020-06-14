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

        // 2. Abstract factory.
    /*Here we create Abstract factory for round-like geometry figures - for example:
    Ring and Circle*/

public class AbstractFactoryRing {

    public static Geometry create (double r, double R, Figures type) {

        if (type.equals(Figures.RING)) return new Ring(r, R);
        if (r == R) return new Circle(R);
        return null;
    }
}
