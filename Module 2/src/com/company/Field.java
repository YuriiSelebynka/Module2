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

//II.1. Creating a child  from the class Rectangle.

public class Field extends Rectangle{
         String color;
         String purpose;
         String material;

    public Field(int length, int width, String color, String purpose, String material) {
        super(length, width);
        this.color = color;
        this.purpose = purpose;
        this.material = material;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Field{" +
                "color='" + color + '\'' +
                ", purpose='" + purpose + '\'' +
                ", material='" + material + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, purpose, material);
    }
}




