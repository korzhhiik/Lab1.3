package com.main.third;

public class Figure {
    private final Point[] points = new Point[5];
    private final String name;

    public Figure(Point firstPoint, Point secondPoint, Point thirdPoint, Point... points) {
        this.name = "Unrecognized";
        this.points[0] = firstPoint;
        this.points[1] = secondPoint;
        this.points[2] = thirdPoint;
        this.points[3] = points[0];
        this.points[4] = points[1];
    }

    public Figure(String name) {
        this.name = name;
    }

    public Point[] getPoints() {
        return points;
    }

    public double lengthSide(Point first, Point second) {
        return Math.sqrt(Math.pow((second.getX() - first.getX()), 2)) + Math.sqrt(Math.pow(second.getY() - first.getY(), 2));
    }

    private double perimeterCalculator(double... sideValues) {
        double perimeter = 0.0;
        for (double side : sideValues) {
            perimeter += side;
        }
        return perimeter;
    }

    public String getFigureDescription() {
        return this.name + " " + perimeterCalculator();
    }
}
