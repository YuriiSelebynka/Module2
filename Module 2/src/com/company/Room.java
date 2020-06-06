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

public class Room extends Field {

    private boolean isWalls;
    private boolean isDoors;
    private boolean isGates;

    public Room(int length, int width, String color, String purpose, String material) {
        super(length, width, color, purpose, material);
        this.isWalls = isWalls;
        this.isDoors = isDoors;
        this.isGates = isGates;
    }

    public boolean isWalls() {
        return isWalls;
    }

    public boolean isDoors() {
        return isDoors;
    }

    public boolean isGates() {
        return isGates;
    }

    @Override
    public String toString() {
        return "Room{" +
                "isWalls=" + isWalls +
                ", isDoors=" + isDoors +
                ", isGates=" + isGates +
                ", color='" + color + '\'' +
                ", purpose='" + purpose + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                isWalls, isDoors, isGates);
    }
}

