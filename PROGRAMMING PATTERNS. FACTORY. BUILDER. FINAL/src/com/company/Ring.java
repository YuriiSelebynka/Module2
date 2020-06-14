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

import java.util.Objects;

        // 1. Factory.
        // 2. Abstract factory.
    /*Here we create class Ring with appropriate fields*/

public class Ring implements Geometry {
    double r;
    double R;

    public Ring(double r, double R) {
        this.r = r;
        this.R = R;
    }

    public Ring(double r) {
    }

        // 1. Factory.
        // 2. Abstract factory.
    /*Getters and setters for class Ring*/

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public double getr() {
        return r;
    }

    public void setr(double r) {
        this.r = r;

    }

        // 1. Factory.
        // 2. Abstract factory.
    /*Methods for class Ring*/

    public double getArea () {
        return Math.PI * (this.getR() * this.getR()
                - this.getr() * this.getr());
    }

    public double getOuterLength () {
        return 2 * Math.PI * this.getR();
    }

    public double getInnerLength () {
        return 2 * Math.PI * this.getr();
    }

    public double getDiameter () {
        return this.getR() * 2;
    }

    public double getLinearLength() {
        return Math.PI * getDiameter();
    }

    @Override
    public String toString() {
        return "Parameters of the Ring: " + "\n" +
                "1. Inner radius is " + r +
                " sm;" + "\n" +"2. Outer radius is " + R +
                " sm;" + "\n" +"3. Area is " + this.getArea() +
                " sm;" + "\n" +"4. The length of inner circle is "
                + this.getInnerLength() + " sm;" + "\n"
                + "5. The length of outer circle is " +
                this.getOuterLength() + " sm." + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ring ring = (Ring) o;
        return Double.compare(ring.r, r) == 0 &&
                Double.compare(ring.R, R) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, R);
    }

    public void isRing() {
        boolean result;
        if (this.getR() - this.getr() > 0) {
            result = true;
        } else {
            result = false;
        }
    }

    public String toJSON () {
        String json = "Ring ("
                + "\""  + "Outer radius\":" + this.getR() + ";"
                + "\""  + "inner radius\":" + this.getr()
                + ")";
        return json;
    }

    public String toXML() {

        String xml = "<Ring>"
                + "<Outer radius>" + this.getR() + "</Outer radius>"
                + "<Inner radius>" + this.getr() + "</Inner radius>"
                +  "</Ring>";

        return xml;
    }
    public String toConsole() {
        return "Parameters of the Ring: " + "\n" +
                "1. Inner radius is " + r +
                " sm;" + "\n" + "2. Outer radius is " + R +
                " sm;" + "\n" + "3. Area is " + this.getArea() +
                " sm;" + "\n" + "4. The length of inner circle is "
                + this.getInnerLength() + " sm;" + "\n"
                + "5. The length of outer circle is " + this.getOuterLength() + " sm.";
    }
}
