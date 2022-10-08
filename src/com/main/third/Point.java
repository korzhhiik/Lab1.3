package com.main.third;

public class Point {
    private final int x;
    private final int y;
    private final String name;

    public Point(int first, int second, String name) {
        this.x = first;
        this.y = second;
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }
}
