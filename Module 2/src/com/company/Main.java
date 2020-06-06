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

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {


        Wheel fulda = new Wheel (5, 7,8);
        System.out.println(fulda.toString());
        System.out.println(fulda.hashCode());
        System.out.println(fulda.getLinearLength());

        Rectangle plat = new Rectangle(8,9);
        System.out.println(plat.getLinearLength());
    }
}
