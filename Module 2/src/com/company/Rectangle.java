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

    //II. Creating class Rectangle.

public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static int  getArea(int length, int width) {
        return length * width;
    }

    public static int  getPerimeter(int length, int width) {
        return length + width;
    }

    public double getLinearLength() {
        return 2 * (this.getWidth() * this.getLength());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public String toJSON () {
        String json = "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
        return json;
    }

    public String toXML() {

        String xml = "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
        return xml;
    }

    public String toConsole() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
