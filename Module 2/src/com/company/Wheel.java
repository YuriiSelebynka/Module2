/*
 *
 * Classame : Java Development (K)
 *
 *  06 June 2020
 *
 * Copyright Selebynka Yurii (UzhNU)
 *
 *  Module 2
 *
 * I. Create a class from the attached document according to the order in your group.
 * The class must contain:
 *1. Constructor.
 *2. Getters/Setters.
 *3. 5 methods.
 *4. Override toString() method.
 *5. Override hash() and equals() methods.
 *
 * II. Inheritance
 *1. Create a child  from the class Rectangle.
 *2. Create another class as a super class for your one.
 *   Or create a daughterly class for your one.
 *
 * III. Polymorphism.
 *1. Create and implement two interfaces for your class.
 *
 * */

package com.company;

import java.util.Objects;

    //II.2. Creating a daughterly class for previous class.

public class Wheel extends Ring{

    private int height;

    public Wheel(double r, double R, int height) {
        super(r, R);
        this.height = height;
    }

    public int getHeight() {
        return getHeight();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "Parameters of the Wheel: " + "\n" +
                "1. Inner radius is " + r + " sm;" + "\n" +
                "2. Outer radius is " + R + " sm;" + "\n" +
                "3. Height is " + height +  " sm;" + "\n" +
                "4. The length of inner circle is "
                + this.getInnerLength() + " sm;" + "\n"
                + "5. The length of outer circle is "
                + this.getOuterLength() + " sm.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
