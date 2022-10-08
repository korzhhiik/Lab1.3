package com.main.first;

public class Rectangle {
    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return areaCalculator();
    }

    public double getPerimeter() {
        return perimeterCalculator();
    }

    private double areaCalculator() {
        return this.side1 * this.side2;
    }

    private double perimeterCalculator() {
        return 2 * (this.side1 + this.side2);
    }
}
