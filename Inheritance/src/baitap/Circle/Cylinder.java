package baitap.Circle;

import baitap.Circle.Circle;

public class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getRadius() * getRadius() * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() + "is volume = " + super.toString();
    }
}
